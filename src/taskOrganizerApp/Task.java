package taskOrganizerApp;

import java.time.LocalDateTime;

/**
 * TODO
 * 
 * @author ATra + MSnooks
 */
public class Task {
	private Category category;
	private String title;
	private Boolean isComplete;
	private LocalDateTime dueDate;
	private String note;
	
	/**
	 * Initializes a Task with a Category and a Title.
	 * 
	 * @param category the Category the task is associated with
	 * @param title the name of the specific task
	 */
	Task(Category category, String title) {
		this.category = category;
		this.title = title;
	}
	
	/**
	 * Initializes a Task with a Category, Title, and DueDate.
	 * 
	 * @param category the Category the task is associated with
	 * @param title the name of the specific task
	 * @param dueDate the dueDate of the task
	 */
	Task(Category category, String title, LocalDateTime dueDate) {
		this.category = category;
		this.title = title;
		this.dueDate = dueDate;
	}
	
	/**
	 * Initializes a Task with a Category, Title, and note.
	 * 
	 * @param category the Category the task is associated with
	 * @param title the name of the specific task
	 * @param note the note associated with the task
	 */
	Task(Category category, String title, String note) {
		this.category = category;
		this.title = title;
		this.note = note;
	}
	
	/**
	 * Initializes a Task with a Category, Title, DueDate, and note.
	 * 
	 * @param category the Category the task is associated with
	 * @param title the name of the specific task
	 * @param dueDate the dueDate of the task
	 * @param note the note associated with the task
	 */
	Task(Category category, String title, LocalDateTime dueDate, String note) {
		this.category = category;
		this.title = title;
		this.dueDate = dueDate;
		this.note = note;
	}
	
	/**
	 * Returns the Category the Task is associated with.
	 * 
	 * @return the Category the Task is associated with
	 */
	public Category getCategory() {
		return category;
	}
	
	/**
	 * Returns the title associated with the Task.
	 * 
	 * @return the title associated with the Task
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Returns the completion status of the Task.
	 * 
	 * @return the completion status of the Task
	 */
	public Boolean getIsComplete() {
		return isComplete;
	}
	
	/**
	 * Returns the dueDate associated with the Task.
	 * 
	 * @return the dueDate associated with the Task
	 */
	public LocalDateTime getDueDate() {
		return dueDate;
	}
	
	/**
	 * Returns the note associated with the Task.
	 * 
	 * @return the note associated with the Task
	 */
	public String getNote() {
		return note;
	}
	
	/**
	 * Sets the Category the Task is associated with.
	 * 
	 * @param category the category a Task is associated with
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	
	/**
	 * Sets the title associated with the Task to the title specified 
	 * in the parameter field.
	 * 
	 * @param title the title of a Task
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Sets whether a Task has or has not been completed.
	 * 
	 * @param isComplete the completion status of a Task
	 */
	public void setComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
	
	/**
	 * Sets the dueDate associated with the Task to the LocalDateTime specified 
	 * in the parameter field.
	 * 
	 * @param dueDate the dueDate associated with a Task
	 */
	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}
	
	/**
	 * Sets the note associated with the Task to the text in the parameter field.
	 * 
	 * @param note the note associated with a Task
	 */
	public void setNote(String note) {
		this.note = note;
	}
	
	/**
	 * Toggles whether a Task is complete.
	 */
	public void toggleComplete() {
		//TODO
	}

	/**
	 * Returns a string in the following format:<br>
	 * TODO
	 */
	@Override
	public String toString() {
		return String.format("%s | Due date: %s  | Note: %s", this.getTitle(), this.getDueDate(), this.getNote()); 
	}	
}
