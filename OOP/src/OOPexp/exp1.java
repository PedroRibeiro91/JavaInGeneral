package OOPexp;

public class exp1 {
	
	public static void main (String[] args) {
		
		myMethod("Peter", 28);
		System.out.println(multiply(5,8));
		// we can be cute and
		myMethod("Anna", multiply(5,5));
		
		System.out.println(greet("Maria"));
		
		classes Math = new classes("Mathematics", "Leonard Euler", 2);
		Math.lecture();
		int x = Math.getRoom(); // we start at room like in any other day 
		Math.newRoom(6); // for the next math classe we need to change room and we go to room 6
		int z = Math.getRoom(); // lets check if we are still in room 6
		
		System.out.println(x);
		System.out.println(z); 
		Math.lecture(); // and we certainly did
		
		classes2 literature = new classes2("Literature", "Luis de Camões", 6, 9);
		literature.lecture();
		
		student Ana = new student("Ana","");
		student Rita = new student("Ana","");
		student Pedro = new student("Pedro","");
		
		System.out.println(Ana.same(Rita));
		System.out.println(Ana.same(Pedro));
		System.out.println(Ana.compareTo(Pedro));
		System.out.println(Ana);
		
		// a new student with a pet
		student John = new student("john", "snake");
		Ana.studentPet();
		John.studentPet();
		
		
		
	}
	// we will call this method from main
	public static void myMethod(String name, int age) {
		System.out.println("Your name is " + name + " and you are " + age + " years old");
	}
	
	// lets make another this time wont be void it will be an integer and it will
	// be the result from multiplying two integers
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static String greet(String name) {
		return "Hello " + name + " how are you?";
	}
	


}
