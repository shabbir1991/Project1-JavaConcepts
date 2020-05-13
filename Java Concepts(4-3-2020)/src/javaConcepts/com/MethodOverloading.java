package javaConcepts.com;
/*  Method name is same, different arguments.
 	Method name is same, number of arguments same but datatypes different.
 	Polymorphisam ---> It means "Many Forms".
 	Method overloading -----> Compile time Polymorphisam (It Checks Syntax errors before saving)  
 	Method overwriting -----> Run time Polymorphisam   */
public class MethodOverloading {

	public static void main(String[] args) {
		// main() is Method in java.
	}
	public static void login(String username,String password) {
		System.out.println(username);
		System.out.println(password);
	}
	public static void login(String username) {
		System.out.println(username);
	}
	public static void login(int mobileNo , String password) {
		System.out.println(mobileNo);
		System.out.println(password);
	}
	public static void login(String username,String password, String securityquestion) {
		System.out.println(username);
		System.out.println(password);
		System.out.println(securityquestion);
	}
}
