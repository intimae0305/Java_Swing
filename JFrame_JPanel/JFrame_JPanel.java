package JFrame_JPanel;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrame_JPanel {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();//�� �г��� ���������� ����Ҽ� ����(�гο� �������� �߰��Ҳ�����)
		frame.add(panel);//frame�ȿ� panel�� �־���� ��
		panel.add(new JLabel("Welcome to this lecture "));
		frame.setResizable(false);//*�� ����� ����� ���� �����ϰ� �� �� �ֳ�
		frame.setVisible(true);//*������ false�� �Ǿ� �־ set visible(true)�ʿ�
		frame.setPreferredSize(new Dimension(840,840/12*9));//�� ������� ����ϰ� ����
		frame.setSize(840, 840/4*3);//������ �ƾ꼳��
		frame.setLocationRelativeTo(null);//����� �����ϰ� ���� ���� �ƴ�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//*������ â �ݾƵ� ��� ����� â ������ ������
		//JFrame�� �����ϴµ� ���� �ϳ��� ��
		//Panel �� JFrame�� ���������� ���� �� �ֵ���
	}
}
