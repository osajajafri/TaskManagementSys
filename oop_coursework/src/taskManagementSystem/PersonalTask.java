package taskManagementSystem;

public class PersonalTask extends Task{

	public PersonalTask(String id, String name) {
		super(id, name);
		
	}
	public PersonalTask(String id, String name, String descrp) {
		super(id, name, descrp);
	}
	@Override
	public String toString() {
		return "Personal Task: " +super.toString();
	}

}
//FINAL COMMIT!