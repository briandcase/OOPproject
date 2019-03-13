import java.awt.EventQueue;
import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;




class loginPortal {
	 private String user_id;
	 public loginPortal (String user_id ) {
		 this.user_id = user_id;
 		   }
	 public void set_the_user_id (String user_id) {
		 this.user_id = user_id;  
	 }
	 public void chose_a_user () {
		  
	 }
}

class take_user_name_pass {
	 private String get_user_id;
	 private String get_user_pass;
	 private String get_user_title;
	 public take_user_name_pass (String get_user_id, String get_user_pass) {
		 this.get_user_id = get_user_id;
		 this.get_user_pass = get_user_pass;
		 this.get_user_title = get_user_title;
	 }
	 public void set_take_user_name_id (String get_user_id) {
		 this.get_user_id = get_user_id;  
	 }
	 public void set_take_user_name_pass (String get_user_pass) {
		 this.get_user_pass = get_user_pass;  
	 }
	 public void set_take_user_Title (String get_user_title) {
		 this.get_user_title = get_user_title;  
	 }
	 public void master_taker () {
		 System.out.println(get_user_id);
		 System.out.println(get_user_pass);
			String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
					"databaseName=NAK_Hospital;integratedSecurity=true;";

			// Declare the JDBC objects.
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
			
	        	try {
	        		// Establish the connection.
	        		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            		con = DriverManager.getConnection(connectionUrl);
	            
	            		// Create and execute an SQL statement that returns some data.
	            	/*	String SQL = 
	            				"SELECT * "
	            				+"FROM patient, WHERE patient_id='"+get_user_id+"' AND patient_id='"+get_user_id+"'";*/
	            		
	            		
	            		
	            		String SQL = ("SELECT * FROM patient WHERE patient_id = '"+get_user_id+"' AND P_password = '"+get_user_pass+"' UNION SELECT * FROM Staff WHERE staff_id =  '"+get_user_id+"' AND S_password = '"+get_user_pass+"'");
	            		//String SQL = ("SELECT * FROM patient WHERE patient_id = '"+get_user_id+"'");
	            		stmt = con.createStatement();
	            		rs = stmt.executeQuery(SQL);
	            
	            		// Iterate through the data in the result set and display it.
	            		while (rs.next()) {
	            			//System.out.println(rs.getString(2));
	            			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3)+ " " + rs.getString(4));
	            		}
	        	}
	        
			// Handle any errors that may have occurred.
			catch (Exception e) {
				e.printStackTrace();
			}
		 
		

	 }
	 
}
public class FORMTEST {

	private JFrame frame;
	private JTextField textFieldNAK1;
	private JTextField textFieldNAKID2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FORMTEST window = new FORMTEST();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FORMTEST() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 712, 576);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnTest = new JButton("LOGIN");
		
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				take_user_name_pass get_credential = new take_user_name_pass(textFieldNAK1.getText(),textFieldNAKID2.getText());
				 System.out.println(textFieldNAKID2.getText());
				get_credential.master_taker();	
				
				
			}
		});
		btnTest.setBounds(167, 143, 97, 25);
		frame.getContentPane().add(btnTest);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBounds(276, 143, 97, 25);
		frame.getContentPane().add(btnExit);
		
		textFieldNAK1 = new JTextField();
		textFieldNAK1.setBounds(167, 55, 178, 22);
		frame.getContentPane().add(textFieldNAK1);
		textFieldNAK1.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(43, 58, 97, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldNAKID2 = new JTextField();
		textFieldNAKID2.setBounds(167, 96, 178, 22);
		frame.getContentPane().add(textFieldNAKID2);
		textFieldNAKID2.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(43, 102, 97, 16);
		frame.getContentPane().add(lblPassword);
	}
}

