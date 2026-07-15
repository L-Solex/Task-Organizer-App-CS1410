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
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AppUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppUI frame = new AppUI();
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
	public AppUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel topbarMenu = new JPanel();
		topbarMenu.setBackground(new Color(192, 192, 192));
		contentPane.add(topbarMenu, BorderLayout.NORTH);
		GridBagLayout gbl_topbarMenu = new GridBagLayout();
		gbl_topbarMenu.columnWidths = new int[]{226, 226, 226, 0};
		gbl_topbarMenu.rowHeights = new int[]{37, 0};
		gbl_topbarMenu.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_topbarMenu.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		topbarMenu.setLayout(gbl_topbarMenu);
		
		JButton btnAddCategory = new JButton("+ Add Category");
		btnAddCategory.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnAddCategory = new GridBagConstraints();
		gbc_btnAddCategory.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAddCategory.insets = new Insets(0, 0, 0, 5);
		gbc_btnAddCategory.gridx = 0;
		gbc_btnAddCategory.gridy = 0;
		topbarMenu.add(btnAddCategory, gbc_btnAddCategory);
		
		JLabel lblAppTitle = new JLabel("Task Organizer");
		lblAppTitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblAppTitle = new GridBagConstraints();
		gbc_lblAppTitle.insets = new Insets(0, 0, 0, 5);
		gbc_lblAppTitle.gridx = 1;
		gbc_lblAppTitle.gridy = 0;
		topbarMenu.add(lblAppTitle, gbc_lblAppTitle);
		
		JButton btnTrash = new JButton("Trash");
		btnTrash.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnTrash = new GridBagConstraints();
		gbc_btnTrash.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnTrash.gridx = 2;
		gbc_btnTrash.gridy = 0;
		topbarMenu.add(btnTrash, gbc_btnTrash);
		
		JPanel taskCategories = new JPanel();
		contentPane.add(taskCategories, BorderLayout.CENTER);
		taskCategories.setLayout(new GridLayout(1, 0, 0, 0));

	}

}
