package oppsdemo1;

public class BookTest {
public static void main(String[] args) {
	
	Book b1=new Book();
	b1.setBookId(100);
	b1.setBookName("Java Programming");
	b1.setPrice(1000);
	b1.setPublisher("Manikanta Publications");
	
	System.out.println("--------------------------------");
	
	System.out.println("****************Details of Book1**************");
	b1.display();
	System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
	System.out.println("The Discounted price of boo is :"+b1.discountPrice());
	
	
	Book b2=new Book();
	b2.setBookId(101);
	b2.setBookName("Pyhton Programming");
	b2.setPrice(1500);
	b2.setPublisher("Deepthi Publications");
	
	
	System.out.println("****************Details of Book2***************");
	b2.display();
	System.out.println(b2.getBookId()+" "+b2.getBookName()+" "+b2.getPrice()+" "+b2.getPublisher());
	System.out.println("The Discounted price of boo is :"+b2.discountPrice());

}
}