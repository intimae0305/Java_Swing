package JFrame_JPanel;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrame_JPanel {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();//단 패널은 독립적으로 사용할수 없음(패널에 여러가지 추가할꺼지만)
		frame.add(panel);//frame안에 panel을 넣어줘야 함
		panel.add(new JLabel("Welcome to this lecture "));
		frame.setResizable(false);//*앱 사이즈를 맘대로 변경 가능하게 할 수 있나
		frame.setVisible(true);//*원래는 false로 되어 있어서 set visible(true)필요
		frame.setPreferredSize(new Dimension(840,840/12*9));//이 사이즈와 비슷하게 나옴
		frame.setSize(840, 840/4*3);//사이즈 아얘설정
		frame.setLocationRelativeTo(null);//가운데에 출현하게 왼쪽 위가 아닌
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//*원래는 창 닫아도 계속 실행됨 창 꺼지면 꺼지게
		//JFrame은 시작하는데 쓰는 하나의 툴
		//Panel 그 JFrame에 여러가지를 넣을 수 있도록
	}
}
