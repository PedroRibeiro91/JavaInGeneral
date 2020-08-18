package OOPexp;

public class CarMain {

	public static void main(String[] args) {
		Car renault = new Car();
		renault.speedUp(30);
		renault.changeGear(2);
		renault.currentState();
	
		double s = Vehicle.safeDistance(30);
		System.out.print(s); 
	} 
	
}
