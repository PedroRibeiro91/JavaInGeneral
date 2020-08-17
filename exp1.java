package OOPexp;

public class exp1 {
	
	public static void main (String[] args) {
		
		myMethod("Peter", 28);
		System.out.println(multiply(5,8));
		// we can be cute and
		myMethod("Anna", multiply(5,5));
		
		System.out.println(greet("Maria"));
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
