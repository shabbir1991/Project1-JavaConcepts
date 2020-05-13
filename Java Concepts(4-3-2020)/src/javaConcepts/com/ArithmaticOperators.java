package javaConcepts.com;

/*
1. Arithmetic Operators [+, -, *, /] ---> Only do Operations by using  'int' and 'double'
2. Comparison Operators [<, <=, >, >=]
3. Logical Operators [&&, ||, !]
*/
public class ArithmaticOperators {

	public static void main(String[] args) {
		
		int i=100, j=200, result;
		result= i+j;   // Here '+' is Arithmetic Operator
		System.out.println("Myresult is:" + result); // Here '+' is Concatenation Operator
		
		j= 50;  // Here 'J' value is over written by 50. So j= 50;
		result = i-j;
		System.out.println("Substraction is : "+ result);
		
		result = i*j;
		System.out.println("Multiplication is :" + result);
		
		result = i/j;
		System.out.println("Divison is "+ result);
		
		String name = "Satish";
			   name = "babu";
			   System.out.println(name); // Output is babu. because name=Satish over written by babu.
			   
//	Note: By using 'final' Keyword we can control variable without over writing.    	
		final String myName = "shabbir";
					// myName = "babu"; ---> It doesn't allow to over write myName with babu
		System.out.println(myName);

	}

}
