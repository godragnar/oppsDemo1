package oppsdemo1;

public class Complex {
	double real;
	double imaginary;
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	void add(Complex obj) // method which accepts object as an argument
	{
		this.real+=obj.real;
		this.imaginary+=obj.imaginary;
	}
	
	void add3(Complex obj1,Complex obj2) // method which accepts object as an argument
	{
	    
        this.real+=this.real+obj1.real+obj2.real;
        this.imaginary+=this.imaginary+obj1.imaginary+obj2.imaginary;
    }

	
	void display()
	{
        System.out.println("r"+this.real+" + i"+this.imaginary);
	}
	
	
	

}
