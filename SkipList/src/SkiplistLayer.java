import java.util.ArrayList;
import java.util.Arrays;

public class SkiplistLayer {
	private ArrayList<SkiplistCell> list;
	private int layer;

	public SkiplistLayer(int layer) {
		list = new ArrayList<SkiplistCell>(0);
		// non valid, must be changed before the layer can be used, 0 is the base layer
		this.layer = layer;

		// header
		list.add(new SkiplistCell("-inf", 0, 0));
		// tail
		list.add(new SkiplistCell("inf", 0, 0));
	}

	public SkiplistLayer(int layer, boolean isSorted, int[] arr) {
		list = new ArrayList<SkiplistCell>(0);
		this.layer = layer;

		if (!isSorted) {
			Arrays.sort(arr);
		}

		if (arr.length > 0) {
			list.add(new SkiplistCell("-inf", 0, arr[0]));

			for (int i = 0; i < arr.length; i++) {
				if (list.get(i).getValue() == Integer.MIN_VALUE) {
					list.add(new SkiplistCell(arr[i], Integer.MIN_VALUE, i == arr.length - 1 ? Integer.MAX_VALUE : arr[i + 1]));
				}
				else if (i == arr.length - 1) {
					list.add(new SkiplistCell(arr[i], arr[i - 1], Integer.MAX_VALUE));
				}
				else {
					list.add(new SkiplistCell(arr[i], arr[i - 1], arr[i + 1]));
				}
			}

			list.add(new SkiplistCell("inf", arr[arr.length - 1], 0));
		}
		else {
			list.add(new SkiplistCell("-inf", 0, Integer.MAX_VALUE));
			list.add(new SkiplistCell("inf", Integer.MIN_VALUE, 0));
		}

	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	public int getLayer() {
		return this.layer;
	}

	public ArrayList<SkiplistCell> getList() {
		return this.list;
	}

	public SkiplistCell getCell(int index) {
		return list.get(index);
	}

	public int getLayerWidth() {
		return list.size();
	}

	public void setLinks(SkiplistCell left, SkiplistCell centerCell, SkiplistCell right, boolean opType) {
		// if inserting or modifying a cell
		if (opType) {
			// set left cell to link to new/modified cell on right
			list.get(indexOf(left)).setRightLink(centerCell.getValue());
			// set right cell to link to new/modified cell on left
			list.get(indexOf(right)).setLeftLink(centerCell.getValue());
		}
		// if removing a cell
		else {
			// set left cell to link to right cell
			list.get(indexOf(centerCell) - 1).setRightLink(right.getValue());
			// set right cell to link to left cell
			list.get(indexOf(centerCell) + 1).setLeftLink(left.getValue());
		}
	}

	public void insertCell(SkiplistCell left, SkiplistCell insertCell, SkiplistCell right) {
		// insert new cell
		list.add(list.indexOf(left) + 1, insertCell);
		setLinks(left, insertCell, right, true);
	}

	public void modifyCell(SkiplistCell left, SkiplistCell modifyCell, SkiplistCell right) {
		// modify cell
		list.get(list.indexOf(left) + 1).setValue(modifyCell.getValue());
		setLinks(left, modifyCell, right, true);
	}

	public void removeCell(SkiplistCell left, SkiplistCell removeCell, SkiplistCell right) {
		setLinks(left, removeCell, right, false);
		// remove desired cell
		list.remove(removeCell);
	}
	
	public void removeCell(SkiplistCell removeCell) {
		try {
			setLinks(list.get(indexOf(removeCell) - 1), removeCell, list.get(indexOf(removeCell) + 1), false);
			// remove desired cell
			list.remove(indexOf(removeCell));
		}catch(Exception e) {
			return;
		}
	}
	
	public int indexOf(SkiplistCell cell) {
		for (int i = 0; i < list.size(); i++) {
			if (cell.getValue() == list.get(i).getValue()/* && cell.getLeftLink() == list.get(i).getLeftLink() && cell.getRightLink() == list.get(i).getRightLink()*/) {
				return i;
			}
		}
		return -1;
	}
	
}