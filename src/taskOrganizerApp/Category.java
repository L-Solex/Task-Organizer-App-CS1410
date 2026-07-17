package taskOrganizerApp;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private String title;
	private ArrayList<Task> activeTasks = new ArrayList<>();
	
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
	public ArrayList<Task> getTasks() {
		return activeTasks;
	}
	
	public void setTitle(String title) {
		//TODO
	}
	
	public void addTask(Task task) {
		//TODO
	}
	
	public void removeTask(Task task) {
		//TODO
	}

	@Override
	public String toString() {
		return "Category [title=" + title + ", activeTasks=" + activeTasks + "]"; //TODO
	}
	
	
	
	
}
