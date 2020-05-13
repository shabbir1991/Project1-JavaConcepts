package inheritenceConcepts.com;
 /* Inheritance (To inherit from a class, use the extends keyword.)
  *  it is possible to inherit variables and methods from one class to another.
	1. Single Inheritance
	2. Multi Level Inheritance
	3. Hybrid Inheritance*/

public class TestingInheritence {

	public static void main(String[] args) {
		// calling GrandParent Class
				GrandParent gp = new GrandParent();
				gp.grandParent();
				
		// calling Parent Class
				Parent p = new Parent();
				p.parent();
				p.grandParent();  // getting from GrandParent Class
				
		// calling Child Class
				Child c = new Child();
				c.child();
				c.parent();        // getting from Parent Class 
				c.grandParent();  // getting from GrandParent Class

	}

}
