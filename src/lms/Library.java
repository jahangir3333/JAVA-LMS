package lms;

import java.io.Console;
import java.util.Scanner;

public class Library {
	public static void showMenu() {			 
	        // Displaying menu
	        System.out.println(
	            "----------------------------------------------------------------------------------------------------------");
	        System.out.println("Press 1 to Add new Book.");
	        System.out.println("Press 0 to Exit Application.");
	        System.out.println(
	            "Press 2 to Upgrade Quantity of a Book.");
	        System.out.println("Press 3 to Search a Book.");
	        System.out.println("Press 4 to Show All Books.");
	        System.out.println("Press 5 to Register Student.");
	        System.out.println(
	            "Press 6 to Show All Registered Students.");
	        System.out.println("Press 7 to Check Out Book. ");
	        System.out.println("Press 8 to Check In Book");
	        System.out.println(
	            "-------------------------------------------------------------------------------------------------------");
	}
	
	public static void clearConsole() {
		System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int choice=9;
		
		
		System.out.println("*******************************JAHANGIR READS LIBRARY*******************************************************\n");
		System.out.println("\t\t\t\t\tWELCOMES YOU\n\t\t\t\tSelect From Following Option:\n");
		System.out.println("************************************************************************************************************\n");
		
		while (choice!=0) {
			showMenu();
			choice=input.nextInt();
		switch (choice) {
		case 1:
			clearConsole();
			System.out.println("-------------------------ADD NEW BOOK------------------------------");
			System.out.print("Enter Book Id: ");
			int id=input.nextInt();
			System.out.print("Enter Book Name: ");
			String name=input.next();
			System.out.print("Enter Book Author: ");
			String author=input.next();			
			System.out.print("Enter Book Quantity: ");
			int bookqty=input.nextInt();
			Book objBook=new Book(id, name, author, bookqty);
			System.out.println("Book Added!");
			if(input.nextInt()==1)
				showMenu();
			break;
		case 4:
			
			break;

		default:
			System.out.println("Please Press Correct Option!");
			break;
		}
		
		
		
		
		}
		
		System.out.println("\n\n\t\t\tApplication closed!");
		
		
	}
	
	
	
	

}
