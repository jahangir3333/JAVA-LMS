package lms;

import java.io.Console;
import java.util.Scanner;

public class Library {
	public static void showMenu() {
		// Displaying menu
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\tLIBRARY MENU");
		System.out.println("Press 1 to Add new Book.");
		System.out.println("Press 0 to Exit Application.");
		System.out.println("Press 2 to Upgrade Quantity of a Book.");
		System.out.println("Press 3 to Search a Book.");
		System.out.println("Press 4 to Show All Books.");
		System.out.println("Press 5 to Register Student.");
		System.out.println("Press 6 to Show All Registered Students.");
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
		Scanner input = new Scanner(System.in);
		int choice = 9;
		int i = 0;

		System.out.println(
				"*******************************JAHANGIR READS LIBRARY*******************************************************\n");
		System.out.println("\t\t\t\t\tWELCOMES YOU\n\t\t\t\tSelect From Following Option:\n");
		System.out.println(
				"************************************************************************************************************\n");

		Book objBook[];
		objBook= new Book[5];
		
		for (int item = 0; item < objBook.length; item++)
			objBook[item]=new Book();
		

		
		while (choice != 0) {
			showMenu();
			System.out.print("Press a Key: ");
			choice = input.nextInt();
			System.out.println("\n");
			switch (choice) {
			case 0:
				System.out.println("\n\n\t\t\tApplication closed!");
				break;
			case 1:
				
				System.out.println("-------------------------ADD NEW BOOK------------------------------");
				System.out.print("Enter Book Id: ");
				int id = input.nextInt();
				input.nextLine();
				System.out.print("Enter Book Name: ");
				String name = input.nextLine();
				
				System.out.print("Enter Book Author: ");
				String author = input.nextLine();
				System.out.print("Enter Book Quantity: ");
				int bookqty = input.nextInt();
				objBook[i].storeBook(id,name,author,bookqty);
				
				System.out.println("\nBook Added!");
				
				
				System.out.print("\nPress 1 to Go Back: ");
				if (input.nextInt() == 1)
					showMenu();
				i++;
				break;
			case 2:
				boolean flag=false;
				System.out.println("Enter Serial No of book");
				int sno=input.nextInt();
				for(int bc=0;bc<objBook.length;bc++) {
					flag=objBook[bc].updateQty(sno);
					if(flag==true)
						break;
				}
				if(flag==false)
					System.out.println("No Book Found with Serial No "+sno);
				
				System.out.print("\nPress 1 to Go Back: ");
				if (input.nextInt() == 1)
					showMenu();
				break;
			case 4:
				System.out.println("\n\t\t\tALL BOOKS");
				
				for (int item = 0; item <i; item++) {
					System.out.println("\nBook "+(item+1));
					objBook[item].showBook();					
				}

				System.out.println("\n");
				
				System.out.print("\nPress 1 to Go Back: ");
				if (input.nextInt() == 1)
					showMenu();
				break;

			default:
				System.out.println("Please Press Correct Option!");
				break;
			}
			

		}

		

	}
	
	
	

}
