package oppsdemo1;

class Lamp {
	
boolean isOn;
void turnOn()
{
	isOn=true;
	System.out.println("Light on?   "+isOn);
}


      boolean isOff;
      void turnOff()
      {
	   isOff=false;
	   System.out.println("Light off?   "+isOff);
      }	
}


public class LampTest
{
	public static void main(String[] args) {
		Lamp led=new Lamp();
		Lamp halogen=new Lamp();
		
		//switch on led & halogen
		led.turnOn();
		halogen.turnOn();
		
	    //switch off led & halogen	
		led.turnOff();
		halogen.turnOff();
		
		
	}
}

