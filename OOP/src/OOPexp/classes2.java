package OOPexp;

public class classes2 extends classes {

	private int block;
	
	public classes2(String name, String professor, int room, int block) {
		super(name, professor, room);
		this.block = block;
	}
	
	public void lecture() {
		System.out.println(this.professor + " will teach " + this.name + " on room " + this.room + " at block " + this.block);
	} // we are inheriting stuff from classes class where there exists a lecture method.
	// there is no problem having a lecture method here
	// what will happens is that when you call an object from a class, the methods what will be used are those defined in that class
	// although we are already inheriting a lecture method from claases, objects from claases2 will use the lecture method defined in classes2 
	
}
