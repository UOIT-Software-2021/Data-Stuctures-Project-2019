import java.util.ArrayList;

public class SkiplistLayer {
	private ArrayList<SkiplistCell> list;
	private int layer;
	
	public SkiplistLayer() {
		//non valid, must be changed before the layer can be used, 0 is the base layer
		layer = -1;
		
		//header
		list.add(new SkiplistCell("inf"));
		//tail
		list.add(new SkiplistCell("-inf"));
	}
	
	public SkiplistLayer(int layer, boolean isSorted, int[] arr) {
		
	}
	
}
