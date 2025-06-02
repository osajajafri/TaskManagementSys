package taskManagementSystem;
import java.util.Scanner;

public class GUI {
private String optInput;
Scanner scan = new Scanner(System.in);
private final TaskManager taskM;
String  id;  
String  name ;
String  descrp ;
String teamName;

Task task;

public GUI() {
	 taskM =new TaskManager();
}

public void welcomeMessage() {
	System.out.println("Welcome to Task Management System!");
	
}

public void showTasks() {

	taskM.showTask();
}

public void addPersonalTask() {
	
	System.out.println("Please enter ID");
	id = scan.nextLine();
	System.out.println("Please enter Name");
	name= scan.nextLine();
	System.out.println("Please enter Description (Optional, press enter to skip)");
	descrp= scan.nextLine();
	if(descrp == null) {
	taskM.addTask(new PersonalTask(id, name));}
	else 
		taskM.addTask(new PersonalTask(id, name, descrp));
}
		  
	
public void addWorkTask() {
	
	System.out.println("Please enter ID");
	id = scan.nextLine();
	System.out.println("Please enter Name");
	name= scan.nextLine();
	System.out.println("Please enter Description (Optional, press enter to skip)");
	descrp= scan.nextLine();
	if(descrp == null) {
		taskM.addTask(new WorkTask(id, name));}
		else 
			taskM.addTask(new WorkTask(id, name, descrp));
		  
	}
public void addTeamWorkTask() {
		
		System.out.println("Please enter ID");
		id = scan.nextLine();
		System.out.println("Please enter Name");
		name= scan.nextLine();
		System.out.println("Please enter Description (Optional, press enter to skip)");
		descrp= scan.nextLine();
		System.out.println("Please enter Team Name");
		teamName = scan.nextLine();
		if(descrp == null) {
			taskM.addTask(new TeamWorkTask(id, name, teamName));}
			else 
				taskM.addTask(new TeamWorkTask(id, name, descrp, teamName));
			  
		}
	


public void removeTasks() {
	String idR;
	System.out.println("Please enter ID: ");
	idR = scan.nextLine();
		taskM.removeTask(idR);
			
	}
	
public void reminderMessage(){
	System.out.println("Task Reminder:");
	for( Task task : taskM) {
		if(task instanceof Remindable) {
			Remindable reminder = (Remindable) task;
			reminder.remindUser();
		}
	}
}

public void options() {

	
	do {
		
		System.out.println("List: \n [a] Add new task\n [b] Remove an existing task \n [c] Show all Tasks \n [e] Exit the program");
		optInput = scan.nextLine();
		
    	
	    switch(optInput.toUpperCase()) {
	    
	    case "A":
	    	System.out.println("Which type of Task required: \n (1) Personal Task \n (2) Work Task \n (3) Team Work Task");
	    	String inputTaskType = scan.nextLine();
	    	switch(inputTaskType){
	    	case "1":
	    		addPersonalTask();
	    		break;
	    	case "2":
	    		addWorkTask();
	    	break;
	    	case "3":
	    		addTeamWorkTask();
	    		break;
	    	}
	    	
	    break;
	    
	    case "B":
	    	removeTasks();
	   
	    break;
	   
	    case "C":
	    	showTasks();
	    
	    break;
	    
	    case "E":
	    	System.out.println("Thank you for using Task Management System");
	    	taskM.storeTaskFile();
        
    	break;
	    
    	default:
    		System.out.println("Invalid Input. Please Enter:");
	    }
	} while(!optInput.equalsIgnoreCase("E"));
}



}
//FINAL COMMIT!