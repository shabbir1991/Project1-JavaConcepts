package accessModifiers.com;
// public ---> we can access within the "Project".
// Private ---> we can access within the "Class".
// Default ---> we can access within the "Package".
// Protected ---> Its almost same as "Default" but we can use it as "Project level" too for that we should use Inheritance Concept. 
public class SameClassSamePackage {
// public variable
	public String name;

	private int no; // private varibale.
// Default Variable	
	boolean status;
	public static void main(String[] args) {
		SameClassSamePackage sc = new SameClassSamePackage();
		sc.protectedMethod();
		
		SameClassSamePackage scsp = new SameClassSamePackage();
		scsp.publicMethod();
		scsp.name="Kannamma";
	// Calling Private Method within the Same Class.	
		scsp.privateMethod();
		scsp.no = 300;
		
		scsp.defaultMethod();
		scsp.status = false;
	}
	
//  Testing Public Method within the same class and same package. 
	public void publicMethod() {
		System.out.println("Public Method");
	// Using Public Variable within the Class.	
		name = "Satish";
		System.out.println(name);
	// Private Variable	
		no = 100;
	// Default Variable
		status = true;
	}
	
// Testing Private Method within the same class and same package.
	private void privateMethod() {
		System.out.println("Private Method");
	// Public Variable
		name = "Public Variable";
	// private Variable	
		no = 200;
	// Default Variable	
		status = true;
	}
	
// Testing Default Method within the same Class and Same Package.
	void defaultMethod() {
		System.out.println("Default Method");
	// Default Variable	
		status = false;
	}
	
// Testing Protected Method within the same Class and Same Package.
	protected void protectedMethod() {
		System.out.println("Protected Method");
	}
	

}
