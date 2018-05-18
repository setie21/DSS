import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;

public class CameraBodies {

	private JFrame frmCameraDss;
	private JTextField txtSearchBar;
	public JTable table;
	public JButton searchButton;
	static SearchBar bar = new SearchBar();
	Connection connection = DatabaseConnection.dbconnector();
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CamDetails window = new CamDetails();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the application.
	 */
  public CameraBodies() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 499, 366);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtSearchBar = new JTextField();
		txtSearchBar.setToolTipText("search bar");
		txtSearchBar.setColumns(10);
		
		searchButton = new JButton("Search");
		
		JLabel lblNewLabel = new JLabel("Camera DSS");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		
		table = new JTable();
		
		GroupLayout groupLayout = new GroupLayout(frmCameraDss.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(109)
					.addComponent(txtSearchBar, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(searchButton, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
					.addGap(64))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(201)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(198))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
					.addGap(18))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(21)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(3)
							.addComponent(txtSearchBar))
						.addComponent(searchButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(table, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
					.addContainerGap())
		);
		frmCameraDss.getContentPane().setLayout(groupLayout);
	
	   //-----------------------------------------------------------------------
		CamDetails cam = new CamDetails();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				table.setBackground(new Color(107,106,104));
				cam.getFrame2().setVisible(true);
				//cam.initialize();
			}
		});
	 
	   
	   searchButton.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//bar.Search();
		}
		   
	   });
		 
		 
   
	
	}
	
	public void creatEvents(){
		
	}
	

	public JFrame getFrame() {
		return frmCameraDss;
	}

	public void setFrame(JFrame frame) {
		this.frmCameraDss = frame;
		frmCameraDss.setTitle("Camera DSS");
	}
}
