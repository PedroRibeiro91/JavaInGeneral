package OOPexp;

public enum floor {
	First(1),
	Second(2),
	Third(3);
	
	private int floorNum;
	
	private floor(int n) {
		this.floorNum = n;
	}
	
	public int getFloor() {
		return this.floorNum;
	}
	
	public void setFloor(int n) {
		this.floorNum = n;
	}
}
