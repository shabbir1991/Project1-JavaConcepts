package anotherPackageForAccessModifiers.com;

import accessModifiers.com.SameClassSamePackage;

public class OutsidePackageClass extends SameClassSamePackage{

	public static void main(String[] args) {
     /* Testing Protected Method in Different Class and Different Package.
		For that we should implement the Inheritance Concept.*/
		OutsidePackageClass opc = new OutsidePackageClass();
		opc.protectedMethod();
			
	// Testing Public Method in Different Class and Different Package.
		SameClassSamePackage scsp = new SameClassSamePackage();
		scsp.publicMethod();
	// Using Public Variable in Different Package.	
		scsp.name ="Different Package";
	
	}

}
