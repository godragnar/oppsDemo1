package oppsdemo1;

public class TraineeTest {
	public static void main(String[] args) {
		Trainee t1=new Trainee();
		t1.display();
		
		Trainee t2=new Trainee(11,"Kiran","Spring",4000);
		t2.display();
		
		Trainee t3 =new Trainee(12, "Surya", "Python",5000);
		t3.display();
	}

}
