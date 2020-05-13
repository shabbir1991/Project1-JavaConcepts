package javaConcepts.com;
// Counseling -->Reema, Resume --> Mary, Marketing --> Tom , Interview --> Naresh , Other --> Sukumar
// 1. == ----> Used for Only int and double.
//  2. equls() ---> Used for String and Char.

// If else ---> It allows Duplicate values.
//				It will go through all the conditions until it matches.
// Switch  ---> It doesn't allow Duplicate values.
//				It will directly jump into the condition that it has to check.
public class ConditionalStatements {

	public static void main(String[] args) {
		
		String expected = "Printouts"; 
		
		switch (expected) {
		case "Counselling":
			System.out.println("Contact Reema");
			break;
		case "Resume":
			System.out.println("Contact Mary");
			break;
		case "Marketing":
			System.out.println("Contact Tom");
			break;	
		case "Interview":
			System.out.println("Contact Naresh");
			break;	
		default:
			System.out.println("Contact Sukumar");
			break;
		}
		
		/*if (expected.equals("Counseling")) {
			System.out.println("Contact Reema");
		} else if(expected.equals("Resume")) {
			System.out.println("Contact Mary");
		}else if(expected.equals("Marketing")) {
			System.out.println("Contact Tom");
		}else if(expected.equals("Interview")) {
			System.out.println("Contact Naresh");
		}else {
			System.out.println("Contact Sukumar");
		}
		*/
		
	/*	
		int no1 =100, no2 =100;
		
		if (no1==no2) { 
			System.out.println("Both the Numbers are same");
					// If condition is matching or not matching , will get same output.
		}  
			
		if (no1==no2) {
			System.out.println("Both the Numbers are same");
		} else {
			System.out.println("Both the Numbers are different");
		}

		int a =135, b =125;
		
		if (a<=b) {
			System.out.println("True");
			
		} else {
			System.out.println("False");

		}
		*/
	}

}
