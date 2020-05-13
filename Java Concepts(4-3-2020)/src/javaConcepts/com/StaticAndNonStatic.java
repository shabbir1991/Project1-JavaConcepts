package javaConcepts.com;
 /*Methods ----- Static and Non Static
		Methods always declare in Class Level.
		Static Methods directly call in another Static Methods.
		NonStatic Methods can't be called inside Static Methods directly.but we can call by using Class reference
*/
//Variables --- Static and Non Static

public class StaticAndNonStatic {
	static int i; // Static variable & Global variable
	String name; // Non Static variable & Global variable
	
	public static void main(String[] args) {
		//calling static method inside main()
		staticMethod();
		// by using below reference , we can call nonStaticMethod inside Static method.
		StaticAndNonStatic abc = new StaticAndNonStatic(); // Creating Object Ref for Class
		abc.nonStaticMethod();
	}
	
	// Static Method (Keyword is 'Static')
	public static void staticMethod() {
		System.out.println("Static Method");
		i=50; // Static variables can call inside static method directly.
	   //name="satish";  ----> Non Static variables can't be called inside static method directly.
	 // By using class ref we can call Non Static variables inside static method.
		StaticAndNonStatic xyz = new StaticAndNonStatic();
		xyz.name = "satish";
		
	}
	
	// Non Static Method (No 'Static' keyword)
	public void nonStaticMethod() {
		System.out.println("Non Static Method");
		i = 30; // Static variables can be used inside Non Static methods.
		name ="shabbir"; // Non Static variables can be used inside another Non Static methods directly.
	}

}
