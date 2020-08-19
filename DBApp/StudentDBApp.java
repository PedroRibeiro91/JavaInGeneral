package DBApp;

import java.util.Scanner;

public class StudentDBApp {

	public static void main(String[] args) {
		//Student student1 = new Student();
		//student1.enroll();
		//student1.payTuition();
		// we dont want to copy and paste the above line every time we want to create a new student
		
		// first lets ask how many student do we want to add
		System.out.println("Enter number of students to add: ");
		Scanner in = new Scanner(System.in);
		int numberofStudents = in.nextInt();
		Student[] students = new Student[numberofStudents]; 
		for (int n=0; n < numberofStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
			
			
		}
		
		}

}
