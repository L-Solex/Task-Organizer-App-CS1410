package taskOrganizerApp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Font;

public class CreateTaskUI extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldReminder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CreateTaskUI dialog = new CreateTaskUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CreateTaskUI() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panelReminder = new JPanel();
			contentPanel.add(panelReminder, BorderLayout.CENTER);
			panelReminder.setLayout(new GridLayout(1, 0, 0, 0));
			{
				JLabel lblReminderName = new JLabel("Reminder: ");
				lblReminderName.setFont(new Font("Tahoma", Font.BOLD, 15));
				lblReminderName.setHorizontalAlignment(SwingConstants.CENTER);
				panelReminder.add(lblReminderName);
			}
			{
				textFieldReminder = new JTextField();
				panelReminder.add(textFieldReminder);
				textFieldReminder.setColumns(10);
			}
		}
		{
			JPanel panelCheckboxes = new JPanel();
			contentPanel.add(panelCheckboxes, BorderLayout.SOUTH);
			{
				JPanel panel = new JPanel();
				panelCheckboxes.add(panel);
				{
					JCheckBox chckbxDueDate = new JCheckBox("Due Date");
					panel.add(chckbxDueDate);
				}
			}
			{
				JPanel panel = new JPanel();
				panelCheckboxes.add(panel);
				{
					JLabel lblNewLabel = new JLabel("Notes: ");
					panel.add(lblNewLabel);
				}
				{
					JTextArea textArea = new JTextArea();
					textArea.setColumns(20);
					panel.add(textArea);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
