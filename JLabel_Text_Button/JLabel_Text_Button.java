package JLabel_Text_Button;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JLabel_Text_Button {
	public static void main(String args[]) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JLabel label=new JLabel("Some Text");
		JButton btn1=new JButton("Click me!!");
		JTextArea txtArea=new JTextArea();//���� ���� ����
		JTextField txtField=new JTextField(200);//�Ķ���ͷ� ���� ���� �� ����
		
		panel.setLayout(new BorderLayout());//panel�� ���̾ƿ��� ����, ���ο� ���̾ƿ� ����
		panel.add(label,BorderLayout.NORTH);//default�� ���� ���Ŀ� ���Ʒ��� �����
		panel.add(btn1,BorderLayout.WEST);
		panel.add(txtArea,BorderLayout.CENTER);
		//�г�, ��, ���̾ƿ� �� ��
		//panel�� ���̾ƿ��� ���� �� ��� �⺻���� �߰��� label���� ���̾ƿ��� ������ �ȴ�.
		frame.add(panel);
		 
		frame.setVisible(true);
		frame.setSize(840,840/4*3);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(840,840/4*3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
