
public class SkiplistCell {
	private int value;
	protected int linkUp, linkDown, linkLeft, linkRight;
	
	public SkiplistCell (int value, int up, int down, int left, int right) {
		value = 0;
		linkUp = up;
		linkDown = down;
		linkLeft = left;
		linkRight = right;
	}
	
	public SkiplistCell(String val) {
		if (val.equalsIgnoreCase("inf")) {
			value = Integer.MAX_VALUE;
		}
		else if (val.equalsIgnoreCase("-inf")) {
			value = Integer.MIN_VALUE;
		}
	}
	
	public void setValue(int setVal) {
		value = setVal;
	}
	
	public int getValue() {
		return value;		
	}
	
}
