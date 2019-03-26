import java.util.ArrayList;

public class SkipList {
	private ArrayList<SkiplistLayer> list;
	private ArrayList<Integer> layerWidth;
	private int height;

	/**
	 * new skiplist with only a header and a tail
	 */
	public SkipList() {
		height = 1;
		list = new ArrayList<SkiplistLayer>();
		setLayerWidth();
	}

	/**
	 * Populated skiplist
	 * 
	 * @param arr
	 */
	public SkipList(int[] arr) {
		list = new ArrayList<SkiplistLayer>();
		
		int[] numReps = new int[arr.length]

		double rand = Math.random();
		for (int i = 0; i < numReps.length; i++) {
			while (rand > 0.5) {
				rand = Math.random();
				numReps[i]++;
			}
		}

		SkiplistLayer temp = new SkiplistLayer();
		for (int i = 0; i < numReps.; i++) {

		}

		height = list.size();
		setLayerWidth();
	}

	public void insert(int val) {
		double rand = Math.random();

		while (rand > 0.5) {
			rand = Math.random();

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
			list.get(i).removeCell(null, null, null);
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

		/*
		 * no longer works for (int i = height - 1; i >= 0; i--) { for (int j = 0; j <
		 * width; j++) { str += list.get(i).getCell(j); } str += "\n"; }
		 */

		return str;
	}

	// helper methods to reduce code length
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
}
