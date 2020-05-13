package javaConcepts.com;
// Variables --> we can store single value at a time.
// Array Variables --> we can store multiple values at a time.
// 1. Single Dimensional.
// 2. Multi Dimensional.
// 3. Object Array.

public class Arrays {
	public static void main(String[] args) {
		/*String name ="Satish"; // Here String variable stores only one value.
		int mobileNo = 902;   // Here int variable stores only one value.
		double salary = 8000.20; // Here double variable stores only one value.
*/		
	// 1. Single Dimensional Array
	// Syntax:-	Datatype variableName[] = new Datatype[row length];
		
		/*String names[] = new String[4];
		names[0] = "Kannamma"; // Array index starts with 0.
		names[1] = "Satish";
		names[2] = "Pandu";
		names[3] = "Sushma";*/
		
		/*System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);*/
		
		/*for (int i = 0; i < 4; i++) {    
// Here Condition is: i<4, If we change the size of Array then we have to change the value here also.    
			System.out.println(names[i]);	
		}*/
		
// Here Instead of changing Array Size every time, I mentioned "names.length".
//		This method will give the Size of the array.
		/*System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}*/
		
	// 2. Multi Dimensional Array
	// Syntax: Datatype variableName[][] = new Datatype[row length][column length]
		
	/*	String details[][] = new String[2][2];
		details[0][0] = "Satish";
		details[0][1] = "satish1234";
		details[1][0] = "Kannamma";
		details[1][1] = "kannamma1234";
	
		// Displaying Row length
		System.out.println(details.length);
	
		// Displaying Column length
		System.out.println(details[0].length);
	
		// Displaying UserName and Password in Table Format.
		for (int i = 0; i < details.length; i++) {
			for (int j = 0; j < details[0].length; j++) {
				System.out.print(details[i][j]); // For Printing Output in Same Line.
				System.out.print(" "); // Giving same between two Columns.
			}
			System.out.println(" "); // For Printing Output in New Line.
		}*/
		
	// Object Array (we can declare any data type in this Object array)
	// Syntax: Object variableName[] = new Object[row length] ---> Single
	//	Object variableName[][] = new Object[row length][column length] ---> Multiple
		
		Object details[] = new Object[5];
		details[0] = "Satish";	 // String data type
		details[1] = "N";    	 // Char data type
		details[2] = 1234;	 	// int data type
		details[3] = 143.341;	// double data type
		details[4] = true;  	// boolean data type
		System.out.println(details.length);
		
		for (int i = 0; i < details.length; i++) {
			System.out.println(details[i]);
		}
		
		
	}
}
