package javaConcepts.com;
// If We want to Display Statements multiple times then we go with Loop Statements.
// 1. For
// 2. While --> If the loop is not incremented it will end up in infinite loop.
//				Condition is checked at the beginning so if the condition is not matched it wont entered into the loop.
// 3. Do While ---> If the loop is not incremented it will end up in infinite loop.
//					Condition is checked at the end if the condition is not matched it will entered at least once inside the loop.
public class LoopingStatements {

	public static void main(String[] args) {
// Instead of writing 3 statements for display name at 3 times, we can go with Loop statements.		
		/*System.out.println("satish");
		System.out.println("satish");
		System.out.println("satish");*/
		
		/*for (int i = 0; i < 3; i++) {
			System.out.println("satish");
		}*/
		
		/*int i=0;
		while (i<3) {
			System.out.println("satish");
			i++;  // Incremental should be mandatory.
		}*/
		
		int i=0;
		do {
			System.out.println("satish");
			i++;		// Here also Incremental should be mandatory
		} while (i<3);

	}

}
