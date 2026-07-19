package taskOrganizerApp;

import java.time.LocalDateTime;

/**
 * TODO
 * @author ATra + MSnooks
 */
public class testApplication {

	public static void main(String[] args) {
		//initializes taskManager for testing
		TaskManager tm = new TaskManager();
		
		//creating test categories
		tm.createNewCategory(new Category("Chores"));
		tm.createNewCategory(new Category("School"));
		System.out.println();
		
		//testing getCategories functionality | should return list of all categories
		System.out.println(tm.getCategories());
		System.out.println();
		
		//testing getCategory | should return a specific category
		tm.getCategory("School");
		System.out.println();
		
		//testing deleteCategory | returns indication of deletion and prints category list to confirm deletion
		tm.deleteCategory("Chores");
		System.out.println(tm.getCategories());
		System.out.println();
		
		tm.addTaskToCategory(tm.getCategory("School"),
				new Task(tm.getCategory("School"),
						"Study for Exam",
						LocalDateTime.MIN, 
						"Read History Vol.1 pp 33-45."));
		
		System.out.println(tm.getCategories());
	}
}
