package taskManagementSystem;

abstract class Task {

	private String id;
	private String name;
	private String  descrp;
	
	public Task(String id, String name){
		this.id = id;
		this.name= name;
	}
	public Task(String id2, String name2,String descrp2) {
		this.id=id2;
		this.name= name2;
		this.descrp=descrp2;
	}
	
	public void setId(String id) {
		this.id = id;
		
	}
	public String getId() {
		return this.id;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return this.name;
	}
	public void setDescription(String descrp) {
		this.descrp = descrp;
	}
	public String  getDescription() {
		return this.descrp;
	}
	
	public String toString() {
		if (descrp.isEmpty()) {
			return "ID: "+id+ " Name: "+name;
		}
		else {
		return "ID: "+id+ " Name: "+name+ " Description: "+descrp;
		}
	}
	
}
//FINAL COMMIT!
