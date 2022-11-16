package kabRegistration;
import java.io.*;
import java.util.*;
import java.io.*;
public class Student extends Person {
	private String courseName;
	private String regNo;
	static int students;
	
	public void Register() {
		System.out.print("Enter Student First Name");
		Scanner scan = new Scanner(System.in);
		this.firstName = scan.next();
		System.out.print("Enter Student Second Name");
		this.secondName = scan.next();
		System.out.print("Enter Student Age");
		this.age = scan.nextInt();
		System.out.print("Enter Student Course Name");
		this.courseName = scan.next();
		System.out.print("Enter Student Reg Number");
		this.regNo = scan.next();
		System.out.print("Enter Student District Name");
		this.district = scan.next();
		students++;
		
		
		
		try {
		      FileWriter myWriter = new FileWriter("students.csv",true);
		      myWriter.write(students+","+firstName+","+secondName+","+age+","+regNo+","+courseName+","+district+"\r\n");
		      myWriter.close();
		      System.out.println("Thank You "+this.firstName+" "+this.secondName+" For registering");
				System.out.println("You are Student Number"+students+" ");
		      System.out.println("\nWelcome to KAB ");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
	
}
