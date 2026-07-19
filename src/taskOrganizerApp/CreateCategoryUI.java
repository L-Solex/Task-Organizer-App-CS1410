package taskOrganizerApp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.scene.Parent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateCategoryUI extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField inputCategoryName;
	private static TaskManager taskManager = new TaskManager();
	private static AppUI mainWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CreateCategoryUI dialog = new CreateCategoryUI(taskManager, mainWindow);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CreateCategoryUI(TaskManager taskManager, AppUI mainWindow) {
		CreateCategoryUI.taskManager = taskManager;
		//JFrame mainApp = mainWindow;
		CreateCategoryUI.mainWindow = mainWindow;
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(2, 1, 0, 0));
		{
			JLabel lblAddCategoryTitle = newCategoryTitle();
			contentPanel.add(lblAddCategoryTitle);
		}
		{
			txtFieldCategoryTitle();
			inputCategoryName.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String categoryTitle = inputCategoryName.getText();
						Category newCategory = new Category(categoryTitle);
						
						if (!categoryTitle.isEmpty()) {
							taskManager.createNewCategory(newCategory);
							CreateCategoryUI.mainWindow.createNewCategory();
							//mainWindow.getContentPane().revalidate();
							//mainWindow.getContentPane().repaint();
							dispose();
						}
						else {
							dispose();
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	/**
	 * 
	 */
	private void txtFieldCategoryTitle() {
		inputCategoryName = new JTextField();
		contentPanel.add(inputCategoryName);
	}

	/**
	 * @return
	 */
	private JLabel newCategoryTitle() {
		JLabel lblAddCategoryTitle = new JLabel("Type New Category Name");
		lblAddCategoryTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAddCategoryTitle.setHorizontalAlignment(SwingConstants.CENTER);
		return lblAddCategoryTitle;
	}

}
