package taskOrganizerApp;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 * @author ATra + MSnooks
 */
public class Trash {
	private ArrayList<Task> deletedTasks;
	
	/**
	 * Initializes the trash can with an empty ArrayList of tasks.
	 * 
	 * @param deletedTasks an ArrayList containing tasks to be deleted or restored
	 */
	Trash() {
		this.deletedTasks = new ArrayList<Task>();
	}
	
	/**
	 * Returns an ArrayList containing each of the tasks within the Trash.,
	 * 
	 * @return deletedTasks an ArrayList containing each task within the Trash
	 */
	public ArrayList<Task> getDeletedTasks() {
		return deletedTasks;
	}
	
	/**
	 * TODO
	 * @param task
	 * @return
	 */
	public Task restoreTask(Task task) {
		return deletedTasks.get(0); //TODO
	}
	
	/**
	 * TODO
	 * @param task
	 */
	public void removeTask(Task task) {
		//TODO
	}
	
	/**
	 * TODO
	 */
	public void removeAllTasks() {
		//TODO
	}
}