package javaConcepts.com;
// Methods or Functions   ---> Purpose of Method is reusability purpose.
//  Purpose of Method is Re-usability purpose.
// To use the same code by multiple people in multiple places.
// Methods should be created on Class Level;
public class Methods {

	public static void main(String[] args) {
		// Calling a method
/*      addition(); // QA1
		addition(); // QA2
		addition(); // QA3
*/
		addition(10, 20);  // QA1 ---> His own values.
		addition(250, 20); // QA2 ---> His own values.
		addition(12, 13); // QA3  ---> His own values.
	}
	
// Methods on Class Level
	public void exampleMethod() {
		// User defined Methods --> Methods defined by users.
	}
	
// 1. Methods without arguments
	/*public static void addition() {
		int i=10, j = 20, result;
		result = i+j;
		System.out.println("Addition of two no's is : " + result);
	}*/
	
	
// 2. Methods with arguments
	public static void addition(int i,int j) {
		int result;
		result = i+j;
		System.out.println("Addition of two no. is " + result);
		
	}
}
