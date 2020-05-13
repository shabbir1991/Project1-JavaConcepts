package constructorConcept;

public class WithArguments {

	public static void main(String[] args) {
		WithArguments wa = new WithArguments(20, 10);
		
	}
// Constructor should be anything like public,private,protected etc..
	public WithArguments(int a,int b) {
		int result;
		result = a-b;
		System.out.println(result);
	}

}
