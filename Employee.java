package oppsdemo1;

import java.util.Scanner;

public class Employee {
	private int empId;
	private String firstName,lastName,desig;
	private double basic,hra,da,grossSal,netSal;
	private static final double TAX=1000;
	Scanner s=new Scanner(System.in);
	public void inputEmployeeDetails()
	{
		System.out.println("Enter Employee Id,First Name,Last Name,Designation");
		empId=s.nextInt();
		firstName=s.next();
		lastName=s.next();
		s.nextLine();
		desig=s.nextLine();
		System.out.println("Enter Employee Basic Salary");
		basic=s.nextDouble();
		
		
	}
	public void caluculateNetSalary()
	
	{
		hra=basic*0.15;
		da=basic*0.10;
		grossSal=basic+hra+da;
		netSal=grossSal-TAX;
		
	}
	public void displayEmployeeDetails()

	{
		System.out.println("************Employee Details*********");
		System.out.println("Employee ID         :"+empId);
		System.out.println("Employee Name       :"+firstName+" "+lastName+" -"+desig+"  ");
		System.out.println("Basic Salary        :"+basic);
		System.out.println("HRA                 :"+hra);
		System.out.println("DA                  :"+da);
		
		System.out.println("Gross Salary        :"+grossSal);
		System.out.println("TAX                 :"+TAX);
		System.out.println("----------------------------------");
		System.out.println("Net salary          :"+netSal);
		System.out.println("----------------------------------");
		 
		
		
		
	}

}
