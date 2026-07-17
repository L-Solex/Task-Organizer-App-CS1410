package taskOrganizerApp;

import java.util.ArrayList;
import java.util.List;

public class Trash {
	private ArrayList<Task> deletedTasks = new ArrayList<>();
	
	/**
	 * Initializes the trash can.
	 * 
	 * @param deletedTasks a list containing tasks to be deleted or restored
	 */
	Trash(ArrayList<Task> deletedTasks) {
		this.deletedTasks = deletedTasks;
	}
	
	/**
	 * Returns an ArrayList containing each of the tasks within the Trash.,
	 * 
	 * @return deletedTasks an ArrayList containing each task within the Trash
	 */
	public ArrayList<Task> getDeletedTasks() {
		return deletedTasks;
	}
	
	public Task restoreTask(Task task) {
		return deletedTasks.get(0); //TODO
	}
	
	public void removeTask(Task task) {
		//TODO
	}
	
	public void removeAllTasks() {
		//TODO
	}
}

