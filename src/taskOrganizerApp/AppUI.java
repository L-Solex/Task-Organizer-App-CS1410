package taskOrganizerApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

/**
 * TODO
 * @author ATra + MSnooks
 */
public class AppUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static TaskManager taskManager = new TaskManager();
	private JPanel taskCategories = new JPanel();
	private AppUI mainApp = this;
	private Category defaultCategory = new Category("default");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppUI frame = new AppUI(taskManager);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppUI(TaskManager taskManager) {
		setPreferredSize(new Dimension(710, 600));
		setResizable(false);
		AppUI.taskManager = taskManager;
		//AppUI mainApp = this;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel topbarMenu = createTopBarMenu();
		
		JButton btnAddCategory = new JButton("+ Add Category");
		btnAddCategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateCategoryUI createCategoryUI = new CreateCategoryUI(taskManager, mainApp);
				createCategoryUI.setVisible(true);
				//getContentPane().add(createCategoryUI);
			}
		});
		btnAddCategory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnAddCategory = new GridBagConstraints();
		gbc_btnAddCategory.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAddCategory.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddCategory.gridx = 0;
		gbc_btnAddCategory.gridy = 0;
		topbarMenu.add(btnAddCategory, gbc_btnAddCategory);
		
		createAppTitle(topbarMenu);
		
		createTrashBtn(topbarMenu);
		
		// Creates the panel that holds the task category list
		//JPanel taskCategories = new JPanel();
		contentPane.add(taskCategories, BorderLayout.CENTER);
		taskCategories.setLayout(new GridLayout(2, 2, 0, 0));
		
		// Creates the default category panel and adds it to taskCategories.
		JPanel taskCategoryDefault = createDefaultCategory(taskCategories);
		
		JButton btnAddTask = createAddTaskBtn(defaultCategory);
		
		taskCategoryDefault.add(btnAddTask, BorderLayout.NORTH);
	}

	/**
	 * @return
	 */
	private JButton createAddTaskBtn(Category category) {
		JButton btnAddTask = new JButton("Add Task");
		btnAddTask.setSize(new Dimension(77, 23));
		btnAddTask.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAddTask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateTaskUI createTaskUI = new CreateTaskUI(taskManager, mainApp);
				createTaskUI.setVisible(true);
			}
		});
		return btnAddTask;
	}

	/**
	 * @return
	 */
	private JPanel createTopBarMenu() {
		JPanel topbarMenu = new JPanel();
		topbarMenu.setBackground(new Color(192, 192, 192));
		contentPane.add(topbarMenu, BorderLayout.NORTH);
		GridBagLayout gbl_topbarMenu = new GridBagLayout();
		gbl_topbarMenu.columnWidths = new int[]{226, 226, 226, 0};
		gbl_topbarMenu.rowHeights = new int[]{37, 0, 0};
		gbl_topbarMenu.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_topbarMenu.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		topbarMenu.setLayout(gbl_topbarMenu);
		return topbarMenu;
	}

	/**
	 * @param taskCategories
	 * @return
	 */
	private JPanel createDefaultCategory(JPanel taskCategories) {
		JPanel taskCategoryDefault = new JPanel();
		taskCategories.add(taskCategoryDefault);
		taskCategoryDefault.setLayout(new BorderLayout(0, 0));
		return taskCategoryDefault;
	}
	
	public JPanel createNewCategory(Category category) {
		JPanel newCategory = new JPanel();
		taskCategories.add(newCategory);
		newCategory.setLayout(new BorderLayout(0,0));
		//contentPane.add(newCategory);
		newCategory.add(createAddTaskBtn(category), BorderLayout.NORTH);
		contentPane.revalidate();
		contentPane.repaint();
		System.out.println("CREATED NEW PANEL AND ADDED IT TO TASK CATEGORIES");
		return newCategory;
	}

	/**
	 * @param topbarMenu
	 */
	private void createTrashBtn(JPanel topbarMenu) {
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 1;
			gbc_panel.gridy = 0;
			topbarMenu.add(panel, gbc_panel);
			{
				JLabel lblAppTitle = new JLabel("Task Organizer");
				lblAppTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
				panel.add(lblAppTitle);
			}
		}
		JButton btnTrash = new JButton("Trash");
		btnTrash.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnTrash = new GridBagConstraints();
		gbc_btnTrash.insets = new Insets(0, 0, 5, 0);
		gbc_btnTrash.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTrash.gridx = 2;
		gbc_btnTrash.gridy = 0;
		topbarMenu.add(btnTrash, gbc_btnTrash);
	}

	/**
	 * @param topbarMenu
	 */
	private void createAppTitle(JPanel topbarMenu) {
	}
}
