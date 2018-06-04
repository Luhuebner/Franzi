package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class test {

	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 86, 198, 85);
		frame.getContentPane().add(comboBox);
		
		comboBox.addItem(1);
		comboBox.addItem(2);
		comboBox.addItem(3);
		comboBox.addItem(4);
		
		JLabel lblNewLabel = new JLabel("Test");
		lblNewLabel.setBounds(10, 11, 97, 63);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Hinzuf\u00FCgen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				lblNewLabel.setText("" + comboBox.getSelectedItem());
			}
		});
		btnNewButton.setBounds(98, 11, 121, 72);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(271, 86, 97, 85);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
	}
}
