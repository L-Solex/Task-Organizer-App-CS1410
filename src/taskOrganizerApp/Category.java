package taskOrganizerApp;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private String title;
	private List<Task> activeTasks = new ArrayList<>();
	
	/**
	 * @param title
	 */
	public Category(String title) {
		this.title = title;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the activeTasks
	 */
	public List<Task> getTasks() {
		return activeTasks;
	}
	
	
}
