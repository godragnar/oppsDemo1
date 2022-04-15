package oppsdemo1;

public class Time {
	int hrs,mins,secs;

	public Time() {
		hrs=mins=secs=0;
		
	}
	
	
	public Time(int hrs, int mins, int secs) {
		
		this.hrs = hrs;
		this.mins = mins;
		this.secs = secs;
	}
	void add(Time t)
    {
           this.secs+=t.secs;
          
            if(this.secs>=60 && this.secs<=119)
            {
                this.mins+=1;
                this.secs-=60;
            }
            if(this.secs==120)
            {
            	this.mins+=2;
            	this.secs-=120;
            }
           
            this.mins+=t.mins;
           
            if(this.mins>=60 && this.mins<=119)
            {
                this.hrs+=1;
                this.mins-=60;
            }
           
            this.hrs+=t.hrs;
       }
   
    void display()
    {
        System.out.println(this.hrs+" : "+this.mins+" : "+this.secs);
    }


	{
		
	}
	
	

}
