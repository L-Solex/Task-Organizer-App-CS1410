package taskOrganizerApp;

import java.util.ArrayList;
import java.util.List;

/**
 * The TaskManager is responsible for handling the logic of the application and 
 * managing requests received from the User Interface.
 * 
 * @author ATra + MSnooks
 */
public class TaskManager {
	private ArrayList<Category> categoryList;
	private Trash trash;
	
	/**
	 * Initializes the TaskManager with an ArrayList to store Categories and a Trash for completed tasks.
	 * The Category ArrayList is initialized with a "Default" category, which cannot be deleted by the user.
	 * 
	 * @param categoryList list of categories for task storage
	 * @param trash list of completed tasks
	 */
	TaskManager() {
		this.categoryList = new ArrayList<Category>();
		categoryList.add(new Category("Default"));
		this.trash = new Trash();
	}
	
	/**
	 * Returns the ArrayList of existing categories.
	 * 
	 * @return the ArrayList of existing categories
	 */
	public ArrayList<Category> getCategories() {
		return categoryList;
	}
	
	/**
	 * Returns the individual Category identified by its title.
	 * 
	 * @param cTitle the title of the Category being selected
	 * @return the corresponding Category
	 * @throws IllegalArgumentException if the category requested does not exist within
	 * the ArrayList containing all categories
	 */
	public Category getCategory(String cTitle) {
		for(Category c : this.categoryList) {
			if (c.getTitle().equals(cTitle)) {
				System.out.println(String.format("Category \"%s\" retrieved.", cTitle)); //TODO exists for debugging purposes
				return c;
			}
		}
		throw new IllegalArgumentException(String.format("Category %s does not exist", cTitle));
	}
	
	/**
	 * Creates a new Category and adds it to the ArrayList of containing all categories.
	 * 
	 * @param category the Category wanting to be added
	 */
	public void createNewCategory(Category category) {
		this.categoryList.add(category);
		System.out.println(String.format("Category: %s added.", category.getTitle()));
	}
	
	/**
	 * Deletes the Category specified by its title.
	 * 
	 * @param title the title of the Category intending to be deleted
	 */
	public void deleteCategory(String title) {
		this.categoryList.remove(getCategory(title));
		System.out.println(String.format("Category \"%s\" deleted.", title));
	}
	
	public void addTaskToCategory(Category category, Task task) {
		category.addTask(new Task(category, task.getTitle()));
		System.out.println(String.format("DEBUG: Task \"%s\" added to category \"%s\"",
				task.getTitle(), category.getTitle()));
		}
	
	/**
	 *TODO
	 * @param category
	 * @param task
	 */
	public void completeTask(Category category, Task task) {
		//TODO
	}
	
	/**
	 * TODO
	 * @param category
	 * @param task
	 */
	public void restoreTask(Category category, Task task) {
		//TODO
	}
/**
 * TODO
 * @param task
 */
	public void permanentlyDelete(Task task) {
		//TODO
	}
	
	/**
	 * TODO
	 */
	public void emptyTrash() {
		//TODO
	}
}
