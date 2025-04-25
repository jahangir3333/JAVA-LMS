package lms;

public class Book {
	int sno;
	String bookname;
	String authorname;
	int bookqty;
	int bookqtycopy;

	public Book(int sno,String bookname,String authorname,int bookqty) {
		this.sno=sno;
		this.bookname=bookname;
		this.authorname=authorname;
		this.bookqty=bookqty;
		this.bookqtycopy=bookqty;
	}
	
	public void showBook() {
		System.out.println("Book Id: "+this.sno);
		
	}
}
