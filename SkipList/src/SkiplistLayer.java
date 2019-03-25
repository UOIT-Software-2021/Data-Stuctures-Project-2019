import java.util.ArrayList;

public class SkiplistLayer {
	private ArrayList<SkiplistCell> list;
	private int layer;
	
	public SkiplistLayer() {
		//non valid, must be changed before the layer can be used, 0 is the base layer
		layer = -1;
		
		//header
		list.add(new SkiplistCell("-inf",0,0));
		//tail
		list.add(new SkiplistCell("inf",0,0));
	}
	
	public SkiplistLayer(int layer, boolean isSorted, int[] arr) {
		this.layer = layer;
		list.add(new SkiplistCell("-inf",0,arr[0]));
		for (int i = 0; i < arr.length; i++){
			if (list.get(i).linkLeft == Integer.MIN_VALUE){
				list.add(new SkiplistCell(i,Integer.MIN_VALUE,arr[i+1]));
			}
			else if (list.get(i).linkRight == Integer.MAX_VALUE){
				list.add(new SkiplistCell(i,arr[i-1],Integer.MAX_VALUE));
			}
			else{
				list.add(new SkiplistCell(i,arr[i-1],arr[i+1]));
			}
		}
		list.add(new SkiplistCell("inf",arr[arr.length-1],0));
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

	public SkiplistCell getCell(int index){
		return list.get(index);
	}

	public void setLinks(SkiplistCell left, SkiplistCell centerCell, SkiplistCell right, boolean opType){
		if (opType){
			//set left cell to link to new cell on right
			list.get(list.indexOf(left)).setRightLink(centerCell.getValue());
			//set right cell to link to new cell on left
			list.get(list.indexOf(right)).setLeftLink(centerCell.getValue());
		}
		else {
			//set left cell to link to right cell
			list.get(list.indexOf(centerCell)-1).setRightLink(right.getValue());
			//set right cell to link to left cell
			list.get(list.indexOf(centerCell)+1).setLeftLink(left.getValue());
		}
	}

	public void insertCell(SkiplistCell left, SkiplistCell insertCell, SkiplistCell right){
		//insert new cell
		list.add(list.indexOf(left)+1, insertCell);
		setLinks(left,insertCell,right,true);
	}

	public void modifyCell(SkiplistCell left, SkiplistCell modifyCell, SkiplistCell right){
		//modify cell
		list.get(list.indexOf(left)+1).setValue(modifyCell.getValue());
		setLinks(left,modifyCell,right,true);
	}

	public void removeCell(SkiplistCell left, SkiplistCell removeCell, SkiplistCell right){
		setLinks(left,removeCell,right,false);
		//remove desired cell
		list.remove(list.indexOf(removeCell));
	}

}