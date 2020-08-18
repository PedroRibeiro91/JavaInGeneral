package OOPexp;

public class Car implements Vehicle {
	
	private int gear;
	private int speed;
	
	public void changeGear(int gear) {
		this.gear = gear;
		
	}
	
	public void speedUp(int change){
		this.speed += change;
	}
	
	public void slowDown(int change){
		this.speed -= change;
	}
	
	

	public void currentState() {
		def();
		System.out.println("This car is on gear " + this.gear + " traveling at a speed of "+  this.speed + " km/h");
	}
	
	


}
