package ButtonFuc_addText_Panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonFuc_addText_Panel {
	public static void main(String args[]) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JLabel label=new JLabel("Some Text");
		JButton btn1=new JButton("Click me!!");
		JButton btn2=new JButton("Exit");//���α׷� ���� ��ư
		JTextArea txtArea=new JTextArea();//���� ���� ����
		JTextField txtField=new JTextField(200);//�Ķ���ͷ� ���� ���� �� ����
		
		JPanel btnPanel=new JPanel();//��ư�� ���� ���� �г� ����
		//BorderLayout�� ���� �������� 4���� �ְ� ���̾ƿ� ���� ���ҽ� flow�� �ڵ� ������
		panel.setLayout(new BorderLayout());//panel�� ���̾ƿ��� ����, ���ο� ���̾ƿ� ����
		panel.add(label,BorderLayout.NORTH);//default�� ���� ���Ŀ� ���Ʒ��� �����
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(btnPanel,BorderLayout.WEST);//��ư�� �ٷ� �ִ� ��� ��ư �г��� ����
		
		
		panel.add(txtArea,BorderLayout.CENTER);
		//�г�, ��, ���̾ƿ� �� ��
		//panel�� ���̾ƿ��� ���� �� ��� �⺻���� �߰��� label���� ���̾ƿ��� ������ �ȴ�.
		 	
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(txtArea.getText());
			}
		});//��ư�� ��� �߰�
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);//����
				
			}
		});
		frame.add(panel);
		 
		frame.setVisible(true);
		frame.setSize(840,840/4*3);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(840,840/4*3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
