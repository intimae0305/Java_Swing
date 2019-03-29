package Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	public Login() {
		
		JPanel panel=new JPanel();
		this.add(panel);
		JLabel label=new JLabel("ID : ");
		JLabel passLabel=new JLabel("Password : ");
		JTextField txtID=new JTextField(10);
		panel.add(label);//layout을 지정하지 않으면 default flow layout이 지정 (flow layout 은 정렬이 default 가운데)
		panel.add(txtID);
		JPasswordField txtPass=new JPasswordField(10);//password처럼 text field
		panel.add(passLabel);
		panel.add(txtPass);
		JButton logBtn=new JButton("Log in");
		panel.add(logBtn);
		logBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtID.getText().equals("kmzhin5")&&txtPass.getText().equals("rlatjs3516!")) {
					JOptionPane.showMessageDialog(null, "Succeed");
				}
				else {
					JOptionPane.showMessageDialog(null, "Error");
				}
			}
		});
		setVisible(true);
		setSize(600, 400);	
		setResizable(false);
		setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	public static void main(String args[]) {
		new Login();
	}
}
