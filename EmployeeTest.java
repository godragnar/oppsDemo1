package oppsdemo1;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1=new Employee();
		
		Employee e2=new Employee();
		Employee e3=new Employee();
	
		e1.inputEmployeeDetails();
		e1.caluculateNetSalary();
        e1.displayEmployeeDetails();
        
        
        e2.inputEmployeeDetails();
		e2.caluculateNetSalary();
        e2.displayEmployeeDetails();
        
        
        e3.inputEmployeeDetails();
		e3.caluculateNetSalary();
        e3.displayEmployeeDetails();
        
}
}