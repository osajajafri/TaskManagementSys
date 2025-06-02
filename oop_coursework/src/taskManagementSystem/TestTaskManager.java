package taskManagementSystem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTaskManager {

	@Test
	void addingTaskSuccessfully() {
		
		TaskManager tm = new TaskManager();
		Task t = new PersonalTask("21A", "Osaja", "nothing");
		assertTrue(tm.addTask(t));
	}
		
	@Test	
	void addTaskFailure() {
		TaskManager tm = new TaskManager();
		Task t = new PersonalTask("21A", "Osaja", "nothing");
		tm.addTask(t);
		assertFalse(tm.addTask(t));
	}

    @Test
    void removeTaskSuccess() {
    	TaskManager tm = new TaskManager();
		Task t = new PersonalTask("21A", "Osaja", "nothing");
		tm.addTask(t);
		assertTrue(tm.removeTask("21A"));	
    }
    @Test
    void removeTaskFailure() {
    	TaskManager tm = new TaskManager();
		Task t = new PersonalTask("21A", "Osaja", "nothing");
		tm.addTask(t);
		assertFalse(tm.removeTask("21A"));
    }
   @Test
    void addingWorkTaskSuccessfully() {
		
		TaskManager tm = new TaskManager();
		Task t = new WorkTask("21A", "Osaja", "nothing");
	assertTrue(tm.addTask(t));
	}
   @Test
   void addingWorkTaskFailure() {
		
		TaskManager tm = new TaskManager();
		Task t = new WorkTask("21A", "Osaja", "nothing");
		tm.addTask(t);
	assertFalse(tm.addTask(t));
	}
   @Test
   void removeWorkTaskSuccess() {
   	TaskManager tm = new TaskManager();
		Task t = new WorkTask("21A", "Osaja", "nothing");
		tm.addTask(t);
		assertTrue(tm.removeTask("21A"));	
   }
   @Test
   void removeWorkTaskFailure() {
   	TaskManager tm = new TaskManager();
		Task t = new WorkTask("21A", "Osaja", "nothing");
		tm.addTask(t);
		assertFalse(tm.removeTask("21A"));
   }
   
   
   @Test
   void addingTeamWorkTaskSuccessfully() {
		
		TaskManager tm = new TaskManager();
		Task t = new TeamWorkTask("21A", "Osaja", "nothing","Hawks");
		assertTrue(tm.addTask(t));
	}
   @Test
   void addingTeamWorkTaskFailure() {
		
		TaskManager tm = new TaskManager();
		Task t = new TeamWorkTask("21A", "Osaja", "nothing","Hawks");
		tm.addTask(t);
		assertFalse(tm.addTask(t));
	}
   @Test
   void removeTeamWorkTaskSuccess() {
   	TaskManager tm = new TaskManager();
		Task t = new TeamWorkTask("21A", "Osaja", "nothing", "Hawks");
		tm.addTask(t);
		assertTrue(tm.removeTask("21A"));	
   }
   @Test
   void removeTeamWorkTaskFailure() {
   	TaskManager tm = new TaskManager();
		Task t = new TeamWorkTask("21A", "Osaja", "nothing", "Hawks");
		tm.addTask(t);
		assertFalse(tm.removeTask("21A"));
   }
   @Test
   public void testStoreAndReadTasksFromFile() {
       
       Task t = new PersonalTask("21A", "Osaja", "nothing");
       Task t1  = new WorkTask("21A", "Osaja", "nothing");
       Task t2 = new TeamWorkTask("21A", "Osaja", "nothing", "Hawks");
       TaskManager tm = new TaskManager();
       tm.storeTaskFile("C:/Users/Osaja Jafri/git/oop_coursework/src/TaskFiles.txt");

 
    


}
}

//FINAL COMMIT!


