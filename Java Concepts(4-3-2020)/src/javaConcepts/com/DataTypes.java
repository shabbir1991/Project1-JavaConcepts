package javaConcepts.com;
 /*In java, we have 2-types of Data Types,
	1. Primitive Data Types
	2. Non Primitive Data Types    

   1.Primitive Data Types:- int, double, char, boolean, byte, short, long 
								[These Variables used for only storing data]
   2. Non Primitive Data Types:- String , Object  [These variables used for multiple purposes]

 		Concatenation Operator (+) ---> By adding two Strings.  */

public class DataTypes {

	public static void main(String[] args) {
		
		int distance = 14;
		System.out.println(distance);
		System.out.println("Distance between from home to work is :" + distance); // Preferable 
		// above 2 statements display same output but 2nd one displays in cleared manner.
		
		double InterestRate = 12.5;
		System.out.println(InterestRate);
		
		char initialName = 'N';
		System.out.println("My Initial is :" + initialName);
		
		boolean status = true;  // It only displays True or False 
		System.out.println("My Status is : " + status);
		
		String mailID = "Shabbir.kdssg@gmail.com";
		System.out.println("My mail ID :" + mailID);

	}

}
