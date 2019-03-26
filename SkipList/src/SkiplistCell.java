public class SkiplistCell {
	private int value, linkLeft, linkRight;
	
	public SkiplistCell (int value) {
		this.value = value;
		//no links therefore it must be edited to be used in the layers
	}
	
	public SkiplistCell (int value, int left, int right) {
		this.value = value;
		linkLeft = left;
		linkRight = right;
	}
	
	@SuppressWarnings("null")
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
