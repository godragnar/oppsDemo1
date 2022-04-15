package oppsdemo1;

class Language
{
	 private String s;
	 private int version;
	 
	 Language()
	 {
		 System.out.println("Im a Implicit Constructor");
		 s="Pyhton";
		 System.out.println("Hello from :"+s);
	 }

	Language(String lang)
	{
		System.out.println("Im a parameterised Constructor");
		this.s=lang;
		System.out.println("Hello from :"+s);
	}
	Language(String lang,int ver)
	{
		System.out.println("Im a parameterised Constructor");
		this.s=lang;
		System.out.println("Hello from :"+s+" V."+ver);
		
	}
}	
	public class LanguagesDemo {
		public static void main(String[] args) {
			Language l1=new Language();
			Language l2=new Language();
			Language l3=new Language("Ruby");
			Language l4=new Language("Scala");
			Language l5=new Language("Java",2);

	


		}
    }

