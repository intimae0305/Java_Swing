package JTable;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Jtable {
	public static void main(String args[]) {
		JFrame frame=new JFrame("Table Prac.");
		JPanel panel=new JPanel();
		frame.add(panel);
		String[] headings=new String[] {"id","name","country"};//headings
		Object[][] data=new Object[][] {//���� ����Ÿ
			{"1","Danniel","Korea"},
			{"2","John","France"},
			{"3","Sunny","Japan"}
		};
		
		JTable table=new JTable(data,headings);//����Ÿ�� ����� �����ڿ� �־���
		table.setPreferredScrollableViewportSize(new Dimension(800,600));//���̺��� ����Ʈ�� �������ִ� ��
		table.setFillsViewportHeight(true);//����Ʈ�� �� ä������� �ƴ���
		panel.add(new JScrollPane(table));//Scroll�� �����ϰ� + ��� �����ֱ�
		
		frame.setVisible(true);
		frame.setSize(800,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
