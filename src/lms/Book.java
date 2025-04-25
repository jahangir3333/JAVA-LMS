package lms;

import java.security.PublicKey;
import java.util.Scanner;

public class Book {
	int sno;
	String bookname;
	String authorname;
	int bookqty;
	int bookqtycopy;
	
	Scanner input=new Scanner(System.in);

	public void storeBook(int sno,String bookname,String authorname,int bookqty) {
		this.sno=sno;
		this.bookname=bookname;
		this.authorname=authorname;
		this.bookqty=bookqty;
		this.bookqtycopy=bookqty;
	}
	
	public void showBook() {
		System.out.println("\nBook SNO: "+this.sno);
		System.out.println("Book Name: "+this.bookname);
		System.out.println("Book Author: "+this.authorname);
		System.out.println("Book Quantity: "+this.bookqty);
	}
	
	public boolean updateQty(int sno) {
			
		if(this.sno==sno){
			System.out.println("Enter the No of Books to Be Added:");
			int c=input.nextInt();
			this.bookqty+=c;
			System.out.println("Book Qty Updated!");
			
			return true;
		}
		
		return false;
	}
}
