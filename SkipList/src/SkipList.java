import java.util.ArrayList;
import java.util.Arrays;

public class SkipList {
	private ArrayList<SkiplistLayer> list;
	private int height, width;

	/**
	 * new skiplist with only a header and a tail
	 */
	public SkipList() {
		height = 0;
		list = new ArrayList<SkiplistLayer>();
		width = list.size();
	}

	/**
	 * Populated skiplist
	 * @param arr
	 */
	public SkipList(int[] arr) {
		list = new ArrayList<SkiplistLayer>();
		
		
	}
	
	@Override
	public String toString() {
		String str = "";
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				
			}
			str += "\n";
		}
		
		return null;
	}

}
