package OOPexp;

public class student implements Comparable<student>{
	
	private String name;
	private String pet;
	
	public student(String name, String pet) {
		this.name = name;
		this.pet = pet;
	}
	// this will be an example on how to compare objects
	// we will be create a method to compare student objects as follows:
	// its common sense that 2 different people can have the same name, but here we will create a method that 
	// forces 2 student objects that have the same name to be equal, i.e, the same student
	
	public boolean same(student other) {
		if (this.name == other.name) { // if the names of 2 student objects are the same then 
			return true; // they are the same
		}
		else {
			return false; 
		}
	}
	// we can comparable if two students name is the same but what if they are different? 
	// lets try and establish a name ordering, alphabetic ordering
	public int compareTo(student other) {
		return this.name.compareTo(other.name); // compareTo compares two string values and returns the distance in the alphabet
	}
	
	// as this class is written we will never get access to a student name
	// but theres a way around it
	
	public String toString() {
		return this.name; // so when we call System.out.println(student) from main we have the name we passed in for the student object
	}
	// lets create a class pet inside this class student, because we want know if a student has a pet or not
	private class Pet{
		public void hasPet() {
			System.out.println("This student has a pet"); // this is just a method in the inner class that will be called
			// later by another method in our outter class
		}
	}
		
	public void studentPet() {
		if (this.pet != "") { // if a pet string different than "" is passed in when we create a student
			Pet p = new Pet(); // we create a Pet object that prints out whatever is in hasPet 
			p.hasPet();
		}
		else { 
			System.out.println("This student doesn't have a pet");
		}
	}
	// this is very confusing as it is but its just for experimentation sake	

}
