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
		JButton btn2=new JButton("Exit");//프로그램 종료 버튼
		JTextArea txtArea=new JTextArea();//값을 쓰는 곳임
		JTextField txtField=new JTextField(200);//파라미터로 숫자 글자 수 조정
		
		JPanel btnPanel=new JPanel();//버튼을 집어 넣을 패널 생성
		//BorderLayout의 경우는 동서남북 4개가 있고 레이아웃 배정 안할시 flow로 자동 설정됨
		panel.setLayout(new BorderLayout());//panel에 레이아웃을 설정, 새로운 레이아웃 생성
		panel.add(label,BorderLayout.NORTH);//default는 양쪽 정렬에 위아래중 가운데임
		
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		panel.add(btnPanel,BorderLayout.WEST);//버튼을 바로 넣는 대신 버튼 패널을 넣음
		
		
		panel.add(txtArea,BorderLayout.CENTER);
		//패널, 라벨, 레이아웃 다 들어감
		//panel에 레이아웃이 설정 된 경우 기본으로 추가된 label들은 레이아웃을 가리게 된다.
		 	
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(txtArea.getText());
			}
		});//버튼에 기능 추가
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);//종료
				
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
