package javaConcepts.com;
// Exception --> Something that we might encounter during execution.
// What are the differences between Final and Finally keywords?
public class ExceptionsConcept {
	
/*	Example :-  final static int no=10;
 				final int noOfDaysInWeek =7;
 				final int noOfWeeksPerMonth = 4;
*/	
	public static void main(String[] args) {
		
		try {
			// Place inside a try block , what are the actions we are going to perform
			// Arithmetic Exception
			// Array Out of Bound Exception
			// File Not Found Exception
			// IO Exception
			// Runtime Exceptions
			
			/*int i=10, j= 0, result;
			result = i/j;
			System.out.println(result);*/
			
			String names[] = new String[2];
			names[0]="satish";
			names[1]="kanna";
			names[2]="sushma";
			
// we can't place an actions or statements between try and catch block
// One 'try' block can have any no. of 'Catch' blocks
// when ever the 'Exception' is found it will skip execution of another steps.
			
		} catch (ArithmeticException ae) {
			// (Exception e) ---> Its a Generic Exception (It means any kind of Exception).
			System.out.println(ae);
		}
		catch (ArrayIndexOutOfBoundsException aie) {
			// (Exception e) ---> Its a Generic Exception (It means any kind of Exception).
			System.out.println(aie);
		}
		finally {
			System.out.println("End of Test");
		}

	}

}
