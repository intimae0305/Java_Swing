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
		JTextArea txtArea=new JTextArea();//값을 쓰는 곳임
		JTextField txtField=new JTextField(200);//파라미터로 숫자 글자 수 조정
		
		panel.setLayout(new BorderLayout());//panel에 레이아웃을 설정, 새로운 레이아웃 생성
		panel.add(label,BorderLayout.NORTH);//default는 양쪽 정렬에 위아래중 가운데임
		panel.add(btn1,BorderLayout.WEST);
		panel.add(txtArea,BorderLayout.CENTER);
		//패널, 라벨, 레이아웃 다 들어감
		//panel에 레이아웃이 설정 된 경우 기본으로 추가된 label들은 레이아웃을 가리게 된다.
		frame.add(panel);
		 
		frame.setVisible(true);
		frame.setSize(840,840/4*3);
		frame.setResizable(false);
		frame.setPreferredSize(new Dimension(840,840/4*3));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
