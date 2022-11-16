package kabRegistration;

import java.util.*;

public class Main {
	/*
	 * The process I chose is Registration.
	 * The program register students and lectures to student.csv and lectures.csv files respectively that are located 
	 * in the same file (kabRegistration) where the whole program reside;
	 * The files can  be opened with Excel for further processing ;
	 * Classes Leacture and Student inherit from abstract class Person.(Inheritance and Abstraction);
	 * The Method Register is behaves differently in student class compared to leacture class.(polymorphism);
	 * Some properties are private, protected, public (encapsulation);
	 *    
	 * Asiimwe Martin 2022/A/KIT/0133/F
	 * 
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int state =0;
		int choice;
		Scanner scann = new Scanner(System.in);
		
		while(state==0) {
			
			System.out.println("\nTo Register Student Enter 1");
			System.out.println("To Register Lecturer Enter 2");
			choice= scann.nextInt();
			
			if(choice == 1) {
				Person student = new Student();
				student.Register();
				
			}else if(choice ==2) {
				Person lecturer = new Leacture();
				lecturer.Register();
				
			}else {
				System.out.println("Thanks For using My System \nI Remain Asiimwe Martin Bye Bye");
				state =1;
			}
			
		}
		
		
		
	}

}
