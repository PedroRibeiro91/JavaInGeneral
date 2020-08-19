package DBApp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int courseCost = 200; // for example
	private static int id = 1000;
	
	
	// how many students will we have?
	public Student() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter students first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter students last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("What year is this student in?\n1 Freshman\n2 Sophmore\n3 Junior \n4 Senior\nEnter students grade year: ");
		this.gradeYear = in.nextInt();
		
		setstudentID();
		
	}
	
	// student ID
	private void setstudentID() {
		id++; // each time we create a student this id increments 1
		this.studentID = gradeYear + "" + id;
		
	}
	
	// course enrollment
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Press 0 to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("0")) {
				courses += "\n" + course;
				tuitionBalance += courseCost;
			}
			else {
				break;
			}
		}
		while(1 != 0);
		System.out.println("tuition Balance "+ tuitionBalance);
		
	}
	
	// view balance
	public void viewBalance() {
		System.out.println("Your balance is:" + tuitionBalance + " M.U");
	}
	
	// pay tuition
	public void payTuition() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter amount to pay: ");
		int payment = in.nextInt(); 
		tuitionBalance = payment - tuitionBalance;
		System.out.println("You just payed: "+ payment + " M.U");
		viewBalance();
		
		
	}
	
	// status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Year: " + gradeYear +
				"\n Student ID: " + studentID + 
				"\nCourses enrolled: " + courses + 
				"\nBalance: " + tuitionBalance;
		
	}
	
	
	
	
	
}
