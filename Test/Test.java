package Test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		JButton btn2=new JButton("Quit");
		JPanel btnPan=new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(label,BorderLayout.NORTH);
		panel.add(txtArea,BorderLayout.CENTER);
		panel.add(btnPan,BorderLayout.WEST);
		btnPan.add(btn1);
		btnPan.add(btn2);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText(txtArea.getText());
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(840,840/4*3);
		frame.setPreferredSize(new Dimension(840,840/4*3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}