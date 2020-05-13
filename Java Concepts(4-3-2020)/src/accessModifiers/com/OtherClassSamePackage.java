package accessModifiers.com;

public class OtherClassSamePackage {

	public static void main(String[] args) {
	// Testing Protected Method in another Class but Same Package.	
		SameClassSamePackage sc = new SameClassSamePackage();
		sc.protectedMethod();
	
	// Testing Public Method in another Class but Same Package.	
		SameClassSamePackage scsp = new SameClassSamePackage();
		scsp.publicMethod();
	// Using Public Variable in another Class 	
		scsp.name = "Another Class but Same Package";
		scsp.defaultMethod();
	// Using Default Variable in Another Class but Same Package.	
		scsp.status = true;


	}

}
