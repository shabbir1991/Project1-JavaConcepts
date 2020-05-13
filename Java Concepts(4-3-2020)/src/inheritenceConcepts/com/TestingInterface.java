package inheritenceConcepts.com;

public class TestingInterface {

	public static void main(String[] args) {
	/*	//calling SeleniumTester Class
		SeleniumTester st = new SeleniumTester();
		st.manualConcepts();
		st.automationTools();
		st.defectManagementTool();
		// calling QTPTester Class
		QTPTester qt = new QTPTester();
		qt.manualConcepts();
		qt.automationTools();
		qt.defectManagementTool();*/
		
// we can't create object reference to interface directly but we can create with the help of Class
		
		Interface_AutomationTester int_aut =new SeleniumTester();
		int_aut.manualConcepts();
		int_aut.automationTools();
		int_aut.defectManagementTool();
		
		int_aut = new QTPTester();
		int_aut.manualConcepts();
		int_aut.automationTools();
		int_aut.defectManagementTool();

	}

}
