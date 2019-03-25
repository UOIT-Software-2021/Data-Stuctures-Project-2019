import java.util.ArrayList;

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
	
	public void insert(int val) {
		double rand = Math.random();
		
		while (rand > 0.5) {
			rand = Math.random();
			
			
		}
	}
	
	public int search(int regex) {
		for (int i = height - 1; i >= 0; i--) {
			int prevMinIndex = -1;
			int previousNonNullIndex = -1;
			for (int j = 0; j < width; j++) {
				
				//just continue if the cell is null
				if (list.get(i).getCell(j).isNull() || j < prevMinIndex) {
					continue;
				}
				else {
					previousNonNullIndex = j;
				}
				
				if (regex > list.get(i).getCell(j).getValue()) {
					break;
				}
				else if (regex == list.get(i).getCell(j).getValue()) {
					return j;
				}
				else {
					prevMinIndex = previousNonNullIndex;
					continue;
				}
			}
		}
		
		return -1;
	}
	
	@Override
	public String toString() {
		String str = "";
		
		for (int i = height - 1; i >= 0; i--) {
			for (int j = 0; j < width; j++) {
				str += list.get(i).getCell(j);
			}
			str += "\n";
		}
		return str;
	}
	
	

}
