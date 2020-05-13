package javaConcepts.com;

public class ReturnTypes {

	public static void main(String[] args) {
	// addition(10, 20);
		
	// System.out.println(result); // result is a local variable inside addition().it doesn't work here.
		
		int retVal= addition(10, 20); // we can store the addition value inside another variable which is defined in main()
		System.out.println(retVal); //  Printing retVal
		
		System.out.println(addition(10, 20)); // Recommended approach
	
		System.out.println(bookTickets());
	}
	public static int addition(int i,int j) {   
		int result; // local variable.
		result = i+j; 
		return result;
	//	System.out.println("Addition of two no. is " + result);
	}
	
	public static String bookTickets() {
		// EnterName , PassportNumber , ConfirmationNumber
		
		String confNumber ="ABCD@1234";
		return confNumber;
	}
	public static void cancelTickets() {
		// ConfirmationNumber
	}
}
