package emailApp;

import java.util.Scanner;

public class EmailObjects{
	private String firstName;
	private String lastName;
	private String password;
	private int passwordLength = 10;
	private String department;
	private String companySuffix = "jppr"; 
	private String email;
	private int mailboxCap = 500;
	private String altEmail;

	
	public EmailObjects(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
		//System.out.println("Email created for " + this.firstName + " " + this.lastName);
		this.department = Department();
		//System.out.println(this.department);
		
		this.password = Password(this.passwordLength);
		
		
		// we have all we need so lets generate our email and password on the following form firstName.lastName@department.com
		
		email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "." + this.department + "@" + companySuffix + ".com";
		System.out.println("Your email is: " + email);
		//System.out.println("Here is your password: "+ this.password);
		
	}
	
	private String Department() {
		System.out.print("Department Codes \n 1: Sales \n 2: Development \n 3: Accounting \n Enter a department code: ");
		Scanner dep = new Scanner(System.in);
		int d = dep.nextInt(); // saves whatever the choice is 1, 2, 3 into d
		if(d == 1) {
			return "Sales";
		}
		else if (d == 2) {
			return "Development";
			
		}
		else if (d == 3) {
			return "Accounting";
		}
		else {
			return "";
		}
		
	}
	// lets generate a random password
	private String Password(int length) {
		String characterSet = "ABCDEFGHIJKLMNOPQRSTUWXYZabcdefghijklmnopqrstuwxyz1234567890@#$"; // these are the characters which our
		// random passwords will be made of
		char[] password = new char[length];
		for (int c = 0; c < length; c++) {
			int rand = (int) (Math.random() * characterSet.length());
			password[c] = characterSet.charAt(rand);
		}
		return new String(password);
		
		
	}
	
	// mailbox cap
	public void setmaiboxCap(int cap) {
		this.mailboxCap = cap;
		
	}
	
	// alternative email
	public void alternativEmail(String email) {
		this.altEmail = email;
	}
	
	// change password
	public void changePassword(String newPassword) {
		this.password = newPassword;
		System.out.println("Your password was changed to: " + this.password);
	}
	
	// we can get all of this information by writing get methods
	
	// password
	public String getPassword() {
		return this.password;
	}
	
	// maibox cap
	public int getmailboxCap() {
		return this.mailboxCap;
	}
	
	// department
	public String getDepartment() {
		return this.department;
	}
	
	public String Info() {
		return "This is " + this.firstName + " " + this.lastName + " they work at our " + this.department + " department." +
	 " Their alternative email is " + this.altEmail + " and their mailbox capacity is " + this.mailboxCap + "MB";
		
	}
	
	
	
	

}
