package lms;

public class Book {
	int sno;
	String bookname;
	String authorname;
	int bookqty;
	int bookqtycopy;

	public void storeBook(int sno,String bookname,String authorname,int bookqty) {
		this.sno=sno;
		this.bookname=bookname;
		this.authorname=authorname;
		this.bookqty=bookqty;
		this.bookqtycopy=bookqty;
	}
	
	public void showBook() {
		System.out.println("\nBook Id: "+this.sno);
		System.out.println("Book Name: "+this.bookname);
		System.out.println("Book Id: "+this.authorname);
		System.out.println("Book Id: "+this.bookqty);
		
		
		
	}
}
