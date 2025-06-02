package taskManagementSystem;
import java.io.*;
import java.util.ArrayList;

public class TaskManager extends ArrayList<Task>{
	
	
    public TaskManager() {
		
	}
	public void showTask() {
		for (Task t : this) {
			System.out.println(t.toString());
		}
	}
	
	
	public boolean addTask(Task t) {
	
		for (Task task : this) {
			if(task.getId().equalsIgnoreCase(t.getId())) {
				System.out.println("ID alread in use, Task is not Added!");
				return false;
				
				
			}
		}
		super.add(t);
		System.out.println("Task Added Succesfully!");
		return true;
			
	}
	public boolean removeTask(String id) {
		for(int i =0;i<this.size() ;i++) {
			if(this.get(i).getId().equalsIgnoreCase(id)) {
				super.remove(i);
				System.out.println("Task has been removed!");
				return true ;
			}
		}
				
		
		
		return false;
		
	}
	public int getSize(){
		
		return this.size();
		
	}
	public void storeTaskFile() {
		try {
			FileWriter taskF = new FileWriter("C:/Users/Osaja Jafri/git/oop_coursework/src/TaskFiles.txt");
			BufferedWriter writer = new BufferedWriter(taskF);
			for(int i =0; i<this.size(); i++) {
				writer.write(this.get(i).toString());
				writer.append("\n");
			}
			writer.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void readTaskFile() {
		
		try {
			FileReader taskF = new FileReader("C:/Users/Osaja Jafri/git/oop_coursework/src/TaskFiles.txt");
			BufferedReader reader = new BufferedReader(taskF);
			for(int i =0; i<this.size(); i++) {
				reader.readLine();
			}
			reader.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}
//FINAL COMMIT!
