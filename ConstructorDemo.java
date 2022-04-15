package oppsdemo1;

public class ConstructorDemo {

	int id;
	String name;
	float salary;
	
    ConstructorDemo()
	{
		System.out.println("Im a Implicit Constructor ");
		id=11;
		name="Sai";
	    salary=50000.0f;			
	}

	public ConstructorDemo(int id, String name, float salary)
	{
		System.out.println("Im a Parameterised Constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display()
	{
	     System.out.println(this.id+ " "+this.name+" "+this.salary);
	}
	public static void main(String[] args) {
		ConstructorDemo cd1 = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(12,"Kiran",6000.0f);
		ConstructorDemo cd3 = new ConstructorDemo();
		
		cd1.display();
		cd2.display();
		cd3.display();
	}
    

	

}

