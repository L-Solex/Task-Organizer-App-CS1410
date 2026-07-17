package taskOrganizerApp;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	private ArrayList<Category> categoryList = new ArrayList<>();
	private Trash trash;
	
	/**
	 * Initializes the TaskManager.
	 * 
	 * @param categoryList list of categories for task storage
	 * @param trash list of completed tasks
	 */
	TaskManager(ArrayList<Category> categoryList, Trash trash) {
		this.categoryList = categoryList;
		this.trash = trash;
	}
	
	/**
	 * @return the categoryList
	 */
	public ArrayList<Category> getCategories() {
		return categoryList;
	}
	
	public void createNewCategory(String title) {
		//TODO
	}
	
	public void deleteCategory(Category category) {
		//TODO
	}
	
	public void completeTask(Category category, Task task) {
		//TODO
	}
	
	public void restoreTask(Category category, Task task) {
		//TODO
	}
	
	public void permanentlyDelete(Task task) {
		//TODO
	}
	
	public void emptyTrash() {
		//TODO
	}
	
}
