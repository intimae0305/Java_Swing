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
		Object[][] data=new Object[][] {//실제 데이타
			{"1","Danniel","Korea"},
			{"2","John","France"},
			{"3","Sunny","Japan"}
		};
		
		JTable table=new JTable(data,headings);//데이타와 헤딩을 생성자에 넣어줌
		table.setPreferredScrollableViewportSize(new Dimension(800,600));//테이블의 뷰포트를 설정해주는 것
		table.setFillsViewportHeight(true);//뷰포트에 꽉 채울것인지 아닌지
		panel.add(new JScrollPane(table));//Scroll이 가능하게 + 헤딩 보여주기
		
		frame.setVisible(true);
		frame.setSize(800,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
