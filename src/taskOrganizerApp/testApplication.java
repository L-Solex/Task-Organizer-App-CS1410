package taskOrganizerApp;

/**
 * TODO
 * @author ATra + MSnooks
 */
public class testApplication {

	public static void main(String[] args) {
		//initializes taskManager for testing
		TaskManager taskManager = new TaskManager();
		
		//creating test categories
		taskManager.createNewCategory(new Category("Chores"));
		taskManager.createNewCategory(new Category("School"));
		System.out.println();
		
		//testing getCategories functionality | should return list of all categories
		System.out.println(taskManager.getCategories());
		System.out.println();
		
		//testing getCategory | should return a specific category
		taskManager.getCategory("School");
		System.out.println();
		
		//testing deleteCategory | returns indication of deletion and prints category list to confirm deletion
		taskManager.deleteCategory("Chores");
		System.out.println(taskManager.getCategories());
	}
}
