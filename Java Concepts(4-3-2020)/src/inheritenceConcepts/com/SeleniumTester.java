package inheritenceConcepts.com;

public class SeleniumTester implements Interface_AutomationTester {

	@Override
	public void manualConcepts() {
		System.out.println("Functional Testing");
		
	}

	@Override
	public void automationTools() {
		
		System.out.println("Knowledge on Eclipse IDE");
	}

	@Override
	public void defectManagementTool() {
		
		System.out.println("Knowledge on JIRA");
	}

}
