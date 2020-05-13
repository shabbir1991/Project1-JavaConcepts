package encapsulationConcept;

public class DataHiding {

	public static void main(String[] args) {
		DataHiding dh = new DataHiding();
		dh.performCalculations();

	}
	
	public void performCalculations() {
		addition();
	//	subtraction();
	//	multiplication();
	}
	
	private void addition() { // public void get()
		int i=10,j=20,result;
		result = i+j;
		System.out.println("Addition ---> "+ result);
		subtraction();
	}
	
	private void subtraction() { // public void getTitle()
		int i=10,j=20,result;
		result = i-j;
		System.out.println("Subtraction ---> " + result);
		multiplication();
	}
	
	private void multiplication() { // public void findElement()
		int i=10,j=20,result;
		result = i*j;
		System.out.println("Multiplication ---> " + result);
	}

}
