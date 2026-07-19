package taskOrganizerApp;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * @author ATra + MSnooks
 */
public class Category {
	private String title;
	private ArrayList<Task> activeTasks;
	
	/**
	 * Initializes a Category with a title and an empty list of tasks.
	 * 
	 * @param title the title of the category being created
	 */
	Category(String title) {
		this.title = title;
		this.activeTasks = new ArrayList<Task>();
	}

	/**
	 * Returns the title associated with the Category.
	 * 
	 * @return the title associated with the Category
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Retuns the ArrayList of tasks associated with the Category.
	 * 
	 * @return the ArrayList of tasks associated with the Category
	 */
	public ArrayList<Task> getTasks() {
		return activeTasks;
	}
	
	/**
	* Returns the individual Task identified by its title.
	* 
	* @param tTitle the title of the Task being selected
	* @return the corresponding Task
	* @throws IllegalArgumentException if the Task requested does not exist within
	* the ArrayList containing all tasks
	*/
	Task getTask(String tTitle) {
		for(Task task : this.activeTasks) {
			if (task.getTitle().equals(activeTasks)) {
				System.out.println(String.format("Task \"%s\" retrieved.", tTitle));
				return task;
			}
		}
		throw new IllegalArgumentException(String.format("Category %s does not exist", tTitle));
	}
	
	
	/**
	 * TODO
	 * @param title
	 */
	public void setTitle(String title) {
		//TODO
	}
	
	/**
	 * TODO
	 * @param task
	 */
	public void addTask(Task task) {
		this.activeTasks.add(task);	}
	
	/**
	 * TODO
	 * @param title
	 */
	public void removeTask(String title) {
		this.activeTasks.remove(getTask(title));
		System.out.println(String.format("Task \"%s\" deleted.", title));
	}

	/**
	 * Returns a string in the following format:<br>
	 * {newline}
	 * {Category: {title}
	 * Tasks: [{tasks}]
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%nCategory: %s%nTasks: %s%n", title, activeTasks);
	}
}
