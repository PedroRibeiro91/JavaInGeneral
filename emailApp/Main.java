package emailApp;

public class Main {

	public static void main(String[] args) {
		
		EmailObjects employee_1 = new EmailObjects("Stan","Smith");
		employee_1.changePassword("12345"); // weak one btw
		employee_1.alternativEmail("altemail@gmail.com");
		System.out.println(employee_1.Info());
		
		

	}

}
