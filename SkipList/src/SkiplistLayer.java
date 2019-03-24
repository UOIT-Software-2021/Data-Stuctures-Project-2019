import java.util.ArrayList;

public class SkiplistLayer {
	private ArrayList<SkiplistCell> list;
	private int layer;
	
	public SkiplistLayer() {
		//non valid, must be changed before the layer can be used, 0 is the base layer
		layer = -1;
		
		//header
		list.add(new SkiplistCell("-inf"));
		//tail
		list.add(new SkiplistCell("inf"));
	}
	
	public SkiplistLayer(int layer, boolean isSorted, int[] arr) {
		this.layer = layer;
		list.add(new SkiplistCell("-inf"));
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
		list.add(new SkiplistCell("inf"));
	}

	public void setLayer() {

	}

	public void getLayer() {

	}


}