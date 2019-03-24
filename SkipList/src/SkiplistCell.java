
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
	
	public SkiplistCell(String val, int left, int right){
		if (val.equalsIgnoreCase("inf")) {
			value = Integer.MAX_VALUE;
			this.linkLeft = left;
			this.linkRight = (Integer) null;
		}
		else if (val.equalsIgnoreCase("-inf")) {
			value = Integer.MIN_VALUE;
			this.linkLeft = (Integer) null;
			this.linkRight = right;
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
