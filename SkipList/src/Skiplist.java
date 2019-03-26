import java.util.ArrayList;

public class Skiplist {
	private ArrayList<SkiplistLayer> list;
	private ArrayList<Integer> layerWidth;
	private int height;

	/**
	 * new skiplist with only a header and a tail
	 */
	public Skiplist() {
		height = 1;
		list = new ArrayList<SkiplistLayer>(0);
		setLayerWidth();
	}

	/**
	 * Populated skiplist
	 * 
	 * @param arr
	 */
	public Skiplist(int[] arr) {
		list = new ArrayList<SkiplistLayer>(0);
		
		int[] numReps = new int[arr.length];

		double rand = Math.random();
		for (int i = 0; i < numReps.length; i++) {
			while (rand > 0.5) {
				rand = Math.random();
				numReps[i]++;
			}
		}

		while (getArrayMaxVal(arr) > 0) {
			int[] temp = new int[getNumPosNumbers(numReps)];
			ArrayList<Integer> array = new ArrayList<Integer>();
			
			for (int i = 0; i < numReps.length; i++) {
				if (numReps[i] > 0) {
					numReps[i]--;
					array.add(arr[i]);
				}
			}
			
			for (int i = 0; i< temp.length; i++) {
				temp[i] = array.get(i);
			}
			list.add(new SkiplistLayer(list.size(), isSorted(temp), temp));
		}

		height = list.size();
		setLayerWidth();
	}

	//FIXME not correct it's just looking for the value it needs to look for the value that's smaller than it
	public void insert(int val) {
		int index = this.search(val, 0);
		int rightIndex = this.search(val, 1);
		int leftIndex = this.search(val, -1);

		if (index == -1 || rightIndex == -1 || leftIndex == -1) {
			return;
		}
		
		int numReps = 1;
		double rand = Math.random();

		while (rand > 0.5) {
			rand = Math.random();
			numReps++;
		}
		
		for (int i = 0; i < numReps; i++) {
			list.get(i).insertCell(list.get(i).getCell(leftIndex), list.get(i).getCell(index), list.get(i).getCell(rightIndex));
		}
	}

	public void delete(int val) {
		int index = this.search(val, 0);
		int rightIndex = this.search(val, 1);
		int leftIndex = this.search(val, -1);

		if (index == -1 || rightIndex == -1 || leftIndex == -1) {
			return;
		}

		for (int i = 0; i < height; i++) {
			list.get(i).removeCell(list.get(i).getCell(leftIndex), list.get(i).getCell(index), list.get(i).getCell(rightIndex));
		}
	}

	/**
	 * Search through the skiplist for an occurrence of the regex
	 * 
	 * @param int regex - what value you are looking for
	 * @param int offset - -1, 0, or 1 get the value before, at, or after the index
	 *            found in the search (for the value based linking)
	 * @return int - the index of occurrence (-1 if no index)
	 */
	public int search(int regex, int offest) {
		for (int i = height - 1; i >= 0; i--) {
			for (int j = 0; j < layerWidth.get(i); j++) {

				if (regex > list.get(i).getCell(j).getValue()) {
					break;
				}
				else if (regex == list.get(i).getCell(j).getValue()) {
					return j;
				}
				else {
					continue;
				}
			}
		}

		return -1;
	}

	@Override
	public String toString() {
		String str = "";

		for (int i = height - 1; i > 0; i++) {
			
		}

		return str;
	}

	// helper methods to reduce code length //
	private void setLayerWidth() {
		for (int i = 0; i < list.size(); i++) {
			layerWidth.add(list.get(i).getLayerWidth());
		}
	}

	private int getArrayMaxVal(int[] arr) {
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	private int getNumPosNumbers(int[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				num++;
			}
		}
		return num;
	}
	
	private boolean isSorted(int[] arr) {
		boolean isSorted = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr [i + 1]) {
				return false;
			}
			if (arr[i] <= arr [i + 1]) {
				isSorted = true;
			}
		}
		return isSorted;
	}
}
