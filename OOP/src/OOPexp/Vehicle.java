package OOPexp;

public interface Vehicle {
	
	final int gears = 1;
	
	void changeGear(int g);
	void speedUp(int u);
	void slowDown(int s);
	
	default void def() {
		System.out.println("We don't know anything about our car, yet.");
	}
	
	static double safeDistance(double speed) {
		// calculate de distance at which you can stop de car safely give a speed
		// we are assuming a friction coeficient of 1 and gravitational acceleration of 10 m/s^2
		return Math.pow(speed, 2)/2*10;
		
	}

}
