package oppsdemo1;

public class ThisDemo {
    int age;
    String Name;
    
    void init(int age)
    {
      this.age=age;
      
    }
    void init(String name)
    {
    	this.Name=name;
    }
    public static void main(String[] args) 
    {
		ThisDemo td1=new ThisDemo();
		td1.init(20);
		td1.init("Kiran");
		System.out.println("The value of age is :"+td1.age);
		System.out.println("The value of name is :"+td1.Name);
	}
}
