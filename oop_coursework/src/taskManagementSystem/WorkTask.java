package taskManagementSystem;

public class WorkTask extends Task implements Remindable{

	public WorkTask(String id, String name) {
		super(id, name);
		
	}
	public WorkTask(String id, String name, String descrp) {
		super(id, name, descrp);
	}
	@Override
	public String toString() {
		return "Work Task: "+ super.toString();
	}
	public void remindUser(){
		System.out.println("Task Reminder for: ");
	}
}
//FINAL COMMIT!