package taskOrganizerApp;

import java.io.File;
import java.util.ArrayList;

/**
 * TODO
 * 
 * @author ATra + MSnooks
 */
public class FileManager {
	private File saveFile;
	private ArrayList<Category> tempCategory; //TODO (temp solution)
	private Trash tempTrash;

	/**
	 * TODO
	 * @param saveFile
	 */
	public FileManager(File file) {
		this.saveFile = file;
	}
	
	/**
	 * TODO
	 * @param categories
	 * @param trash
	 * @return
	 */
	public boolean saveData(ArrayList<Category> categories, Trash trash) {
		return false; //TODO 
	}
	
	/**
	 * TODO
	 * @return
	 */
	public ArrayList<Category> loadCategories() {
		return tempCategory; //TODO
	}
	
	/**
	 * TODO
	 * @return
	 */
	public Trash loadTrash() {
		return tempTrash;
	}
}
