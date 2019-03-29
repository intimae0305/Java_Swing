package Test;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Test {
	public static void main(String args[]) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JLabel label=new JLabel("Some text");
		JTextArea txtArea=new JTextArea();
		JButton btn1=new JButton("Click me");
		
		panel.setLayout(new BorderLayout());
		panel.add(label,BorderLayout.NORTH);
		panel.add(txtArea,BorderLayout.CENTER);
		panel.add(btn1,BorderLayout.WEST);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(840,840/4*3);
		frame.setPreferredSize(new Dimension(840,840/4*3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
	}
}