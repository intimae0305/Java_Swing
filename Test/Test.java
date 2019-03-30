package Test;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test extends JFrame {
	public Test(){
		JPanel panel=new JPanel();
		this.add(panel);
		panel.setLayout(new BorderLayout());
		JPanel idPassPanel=new JPanel();
		panel.add(idPassPanel,BorderLayout.EAST);
		JLabel idLabel=new JLabel("ID : ");
		JLabel passLabel=new JLabel("Password :");
		JTextField idField=new JTextField(10);
		JTextField passField=new JTextField(10);
		idPassPanel.add(idLabel);
		idPassPanel.add(idField);
		idPassPanel.add(passLabel);
		idPassPanel.add(passField);
		setVisible(true);
		setSize(840,700);
		setDefaultCloseOperation(Test.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]) {
		new Test();
	}
}