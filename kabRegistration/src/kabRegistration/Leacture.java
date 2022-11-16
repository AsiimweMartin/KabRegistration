package kabRegistration;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Leacture extends Person {
	private String program;
	private int salary;
	static int lectures;
	
	public void Register() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Lectures FirstName");
		this.firstName= scan.next();
		System.out.print("Enter Lectures secondName");
		this.secondName= scan.next();
		System.out.print("Enter District Name");
		this.district= scan.next();
		System.out.print("Enter Lectures Age");
		this.age= scan.nextInt();
		System.out.print("Enter Program Taught");
		this.program= scan.next();
		System.out.print("Enter Salary Amount");
		this.salary= scan.nextInt();
		lectures++;
		
		
		
		try {
		      FileWriter myWriter = new FileWriter("lecturers.csv",true);
		      myWriter.write(lectures+","+firstName+","+secondName+","+age+","+program+","+salary+"\r\n");
		      myWriter.close();
		      System.out.println("Thank You "+this.firstName+" "+this.secondName+" For registering");
			  System.out.println("You are Leacture Number"+lectures+" ");
		      System.out.println("\nWelcome to KAB");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
	}
	
	

}
