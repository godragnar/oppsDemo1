package oppsdemo1;

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 =new Complex(10.3,67.4);
	    Complex c2 =new Complex(0.7,3.6);
	    Complex c3=new Complex(14.5,61.5);
		
		
		
	    
		c1.add(c2);
        System.out.println("The addition of  2 complex N.o's is:");
		
		c1.display();
		
		c1.add(c3);
		
		System.out.println("The addition of  3 complex N.o's is:");
		
		c1.display();
	}

}
