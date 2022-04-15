package oppsdemo1;

import java.util.Scanner;

public class Student {
	private int rollNumber;
	private String name,course;
	private float m1,m2,m3,total;
	Scanner s=new Scanner(System.in);
	public void input()
	{
		System.out.println("Enter Roll No,Name,course:");
		rollNumber=s.nextInt();
		name=s.next();
	    course=s.next();
	    
	    System.out.println("Enter marks of 3 subjects:");
		 m1=s.nextFloat();
		 m2=s.nextFloat();
		 m3=s.nextFloat();
		
	
		
	}
	
	
	public float calculate()
	{
		total=m1+m2+m3;
		return total;
		
	}
	public void display()
	{
		System.out.println("************Stduent Details**********");
		System.out.println("RollNumber    :"+rollNumber);
		System.out.println("Name          :"+name);
		System.out.println("Cousre        :"+course);
		System.out.println("Total         :"+total);
	}

}
