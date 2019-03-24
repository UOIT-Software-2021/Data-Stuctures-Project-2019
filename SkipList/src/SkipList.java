import java.util.ArrayList;
import java.util.Arrays;

public class SkipList {
	private ArrayList<SkiplistLayer> list;

	/**
	 * new skiplist with only a header and a tail
	 */
	public SkipList() {
		list = new ArrayList<SkiplistLayer>();

		
	}

	/**
	 * Populated skiplist
	 * @param arr
	 */
	public SkipList(int[] arr) {
		list = new ArrayList<SkiplistLayer>();
		
		//header
		//list.add(new SkiplistCell("inf"));
		
		//check if the input data is sorted
		boolean isInputSorted = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr [i + 1]) {
				isInputSorted = false;
				break;
			}
			if (arr[i] <= arr [i + 1]) {
				isInputSorted = true;
			}
		}
		
		//if not sorted, sort it
		if (!isInputSorted) {
			Arrays.sort(arr);
		}
		
		//add all elements to the list
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 < arr.length) {
				//list.add(new SkiplistCell(arr[i], 0, 0, list.get(list.size() - 1).getValue(), list.get(list.size() + 1).getValue()));
			}
			else {
				//list.add(new SkiplistCell(arr[i], 0, 0, list.get(list.size() - 1).getValue(), Integer.MAX_VALUE));
			}
		}
		
		//tail
		//list.add(new SkiplistCell("-inf"));
		
	}
	
	@Override
	public String toString() {
		String str = "";
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				
			}
		}
		
		return null;
	}

}
