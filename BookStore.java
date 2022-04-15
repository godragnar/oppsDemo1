package oppsdemo1;

import java.util.Scanner;

public class BookStore {
	private long bookId;
	private String bookName; 
	private String authorName;
	private float bookPrice;
	Scanner s = new Scanner(System.in);
	
	public void inputBookDetails()
    {
	   System.out.println("Enter bookId   bookName authorName  bookPrice  ");
	   bookId=s.nextLong();
	   bookName=s.next();
	   authorName=s.next();
	   bookPrice=s.nextFloat();
	}
	
	public void displayBookDetails()
	{
		System.out.println("***************Book Details**********************");
		System.out.println("BookId is :"+bookId);
		System.out.println("BookName is :"+bookName);
		System.out.println("AuthorName is :"+authorName);
		System.out.println("BookPrice is :"+bookPrice);
		
		
	}
	

}
