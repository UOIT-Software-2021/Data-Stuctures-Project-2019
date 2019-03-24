
public class SkiplistCell {
	boolean nullCell;
	private int value;
	protected int linkLeft, linkRight;
	
	public SkiplistCell (int value, int left, int right) {
		value = 0;
		nullCell = false;
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
		else if (val.equalsIgnoreCase("null")) {
			nullCell = true;
		}
	}

	
	public void setValue(int setVal) {
		value = setVal;
	}
	
	public int getValue() {
		return value;		
	}
	
	public void setRightLink(int link) {
		this.linkRight = link;	
	}
	
	public int getRightLink() {
		return this.linkRight;
	}
	
	public void setLeftLink(int link) {
		this.linkLeft = link;	
	}
	
	public int getLeftLink() {
		return linkLeft;
	}
}
