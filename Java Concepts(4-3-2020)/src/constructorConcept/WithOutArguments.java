package constructorConcept;
/*
Methods:-
1. Methods will have 'return' types.we need to call a method explicitly to run . 
2. Method name will not be same as Class name.
3. Methods can be static or non-static.
	
Constructor:-
1. Constructor name should be same as Class name.
2. Constructor doesn't have any 'return' types.
3. Constructor can be called by Simply Creating Object reference.
4. Constructor will not be static. It's always non-static.
*/

public class WithOutArguments {
	public static void main(String[] args) {
/* "WithOutArguments()" is non static Constructor and we are calling inside static method [main()] 
    that's why we are creating object reference for Class. by using that reference we can call non static methods inside static method
   */
		
	/* 	//	Calling Normal method.
	  		WithOutArguments woa = new WithOutArguments();
			woa.addition();*/
		
	//		Calling Constructor 
			WithOutArguments woa = new WithOutArguments();

	}
	
	// Constructor
		public WithOutArguments() {
		int a=10,b=20,c;
		c= a+b;
		System.out.println(c);
	}
	
	
	
/*     //Creating non static method
	 	public int addition() {
		int i=10,j=20,result;
		result = i+j;
		System.out.println("Addition is : " +result);
		return result;
		
	}*/

}
