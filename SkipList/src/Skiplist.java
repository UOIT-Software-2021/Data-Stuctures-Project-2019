import java.util.ArrayList;

public class Skiplist {
	private ArrayList<SkiplistLayer> list;
	private ArrayList<Integer> layerWidth;
	private int height;
	private int maxWidth;

	/**
	 * new skiplist with only a header and a tail
	 */
	public Skiplist() {
		height = 1;
		list = new ArrayList<SkiplistLayer>(0);
		setLayerWidth();
		maxWidth = layerWidth.get(0);
	}

	/**
	 * Populated skiplist
	 * 
	 * @param arr
	 */
	public Skiplist(int[] arr) {
		list = new ArrayList<SkiplistLayer>(0);

		int[] numReps = new int[arr.length];

		for (int i = 0; i < numReps.length; i++) {
			numReps[i] = 1;
		}

		double rand = Math.random();
		for (int i = 0; i < numReps.length; i++) {
			rand = Math.random();
			while (rand > 0.5) {
				rand = Math.random();
				numReps[i]++;
			}
		}
		int[] temp = new int[getNumPosNumbers(numReps)];
		while (getArrayMaxVal(numReps) > 0) {
			temp = new int[getNumPosNumbers(numReps)];
			ArrayList<Integer> array = new ArrayList<Integer>();

			for (int i = 0; i < numReps.length; i++) {
				if (numReps[i] > 0) {
					numReps[i]--;
					array.add(arr[i]);
				}
			}

			for (int i = 0; i < temp.length; i++) {
				temp[i] = array.get(i);
			}
			list.add(new SkiplistLayer(list.size(), isSorted(temp), temp));
		}

		height = list.size();
		setLayerWidth();
		maxWidth = layerWidth.get(0);
	}

	// FIXME not correct it's just looking for the value it needs to look for the
	// value that's smaller than it
	public void insert(int val) {

		SkiplistCell cell = new SkiplistCell(val);

		int numReps = 1;
		double rand = Math.random();

		while (rand > 0.5) {
			rand = Math.random();
			numReps++;
		}
		
		if (numReps > height) {
			for (int i = 0; i < numReps - height; i++) {
				list.add(new SkiplistLayer(height + i));
			}
		}

		try {
			for (int i = 0; i < numReps; i++) {
				for (int j = 0; j < layerWidth.get(i); j++) {
					if (list.get(i).getList().get(j).getValue() > cell.getValue()) {
						cell.setRightLink(list.get(i).getList().get(j + 1).getValue());
						cell.setLeftLink(list.get(i).getList().get(j - 1).getValue());
						list.get(i).insertCell(list.get(i).getList().get(j - 1), cell, list.get(i).getList().get(j + 1));
						break;
					}
				}
			}
		} catch (Exception e) {
		}

		setLayerWidth();
	}

	public void delete(int val) {
		SkiplistCell cell = this.search(val);

		if (cell == null) {
			return;
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < layerWidth.get(i); j++) {
				if (list.get(i).getList().get(j).getValue() == cell.getValue()) {
					list.get(i).removeCell(cell);
					break;
				}
			}
		}

		setLayerWidth();
	}

	/**
	 * Search through the skiplist for an occurrence of the regex
	 * 
	 * @param int regex - what value you are looking for
	 * @param int offset - -1, 0, or 1 get the value before, at, or after the index
	 *            found in the search (for the value based linking)
	 * @return SkiplistCell - the cell object
	 */
	public SkiplistCell search(int regex) {
		for (int i = height - 1; i >= 0; i--) {
			for (int j = 0; j < layerWidth.get(i); j++) {

				int compareRegex = list.get(i).getCell(j).getValue();

				if (regex == compareRegex) {
					return list.get(i).getCell(j);
				}
				else if (regex < compareRegex) {
					continue;
				}
			}
		}

		return null;
	}

	@Override
	public String toString() {
		String str = "";
		/*
		 * String[][] strArr = new String[height][maxWidth];
		 * 
		 * for (int i = 0; i < maxWidth; i++) { strArr[0][i] =
		 * list.get(0).getCell(i).toString(); }
		 * 
		 * for (int i = 1; i < height; i++) { int currWidth =
		 * list.get(i).getLayerWidth(); for (int j = 0; j < currWidth; j++) { int
		 * currentIndex = j; if (list.get(i).getCell(j).getValue() == list.get(i -
		 * 1).getCell(currentIndex).getValue()) { strArr[i][currentIndex] =
		 * list.get(i).getCell(j).toString();
		 * 
		 * } else { strArr[i][currentIndex] = " "; currentIndex++; } } }
		 * 
		 * for (int j = 0; j < height; j++) { for (int i = 0; i < maxWidth; i++) { str
		 * += strArr[j][i] + " "; } str += "\n"; }
		 * 
		 */

		for (int i = 0; i < height; i++) {
			int currWidth = layerWidth.get(i);
			for (int j = 0; j < currWidth; j++) {
				str += list.get(i).getCell(j).toString() + " ";
			}
			str += "\n";
		}

		return str;
	}

	// helper methods to reduce code length //
	private void setLayerWidth() {
		layerWidth = new ArrayList<Integer>(0);
		for (int i = 0; i < list.size(); i++) {
			layerWidth.add(list.get(i).getLayerWidth());
		}
		maxWidth = layerWidth.get(0);
	}

	private int getArrayMaxVal(int[] arr) {
		int max = Integer.MIN_VALUE;
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

		if (arr.length < 3) {
			return true;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
			if (arr[i] <= arr[i + 1]) {
				isSorted = true;
			}
		}
		return isSorted;
	}
}
