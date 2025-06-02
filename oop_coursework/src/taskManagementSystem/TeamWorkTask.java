package taskManagementSystem;

public class TeamWorkTask extends WorkTask implements Remindable{
private String teamName;

public TeamWorkTask(String id, String name, String teamName) {
	super(id, name);
	this.teamName = teamName;
}
	public TeamWorkTask(String id, String name, String descrp, String teamName) {
		super(id, name, descrp);
		this.teamName = teamName;
	}
	
	
	
	@Override
	public String toString() {
		String s = super.toString();
		String p = s.substring(9);
		return "TeamWork Task: "+ p + " Team Name: " +teamName;
	}
	
	public void remindUser() {
		System.out.println("Team Task reminder for: "+ teamName);
	}
	
	
}
//FINAL COMMIT!