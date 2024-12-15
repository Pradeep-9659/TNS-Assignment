package com.pradeep.assignment;
import java.util.Scanner;
import com.pradeep.assignment.utilities.*;
import com.pradeep.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//get the choice from user to want developer or manager details
		System.out.print("enter the option , developer (or) manager  : ");
		
		//the constructor called from the EmployeeUtilities class
		new EmployeeUtilities(sc.next());
		

	}

}
