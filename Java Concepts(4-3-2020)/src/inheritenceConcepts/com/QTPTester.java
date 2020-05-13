package inheritenceConcepts.com;

public class QTPTester implements Interface_AutomationTester {

	@Override
	public void manualConcepts() {
		
		System.out.println("Regression Testing");
	}

	@Override
	public void automationTools() {
		
		System.out.println("Knowledge on QTP");
	}

	@Override
	public void defectManagementTool() {
		
		System.out.println("Knowledge on QC");
		
	}

}
