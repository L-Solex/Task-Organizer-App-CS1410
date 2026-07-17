package taskOrganizerApp;

import java.io.File;
import java.util.ArrayList;

public class FileManager {
	private File saveFile;
	private ArrayList<Category> tempCategory; //TODO (temp solution)
	private Trash tempTrash;

	/**
	 * @param saveFile
	 */
	public FileManager(File file) {
		this.saveFile = file;
	}
	
	public boolean saveData(ArrayList<Category> categories, Trash trash) {
		return false; //TODO 
	}
	
	public ArrayList<Category> loadCategories() {
		return tempCategory; //TODO
	}
	
	public Trash loadTrash() {
		return tempTrash;
	}
}
