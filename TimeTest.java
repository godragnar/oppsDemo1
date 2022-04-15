package oppsdemo1;

public class TimeTest {
public static void main(String[] args) {
	Time t1=new Time(12,45,55);
	Time t2=new Time(10,30,30);
	Time t3=new Time(9,25,19);
	
	t1.add(t2);
	 
	System.out.println("The Addition of 2 Times is :");
	t1.display();
	
	t1.add(t3);
	 
	System.out.println("The Addition of 3 Times is :");
	t1.display();
}
}
