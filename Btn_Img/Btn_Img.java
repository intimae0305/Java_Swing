package Btn_Img;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Box;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Btn_Img {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Btn_Img window = new Btn_Img();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Btn_Img() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 549, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Kweon\\Desktop\\\uD30C\uC77C\\2.png"));//기본 아이콘 이미지
		btnNewButton.setPressedIcon(new ImageIcon("C:\\Users\\Kweon\\Desktop\\\uD30C\uC77C\\3.png"));//아이콘을 눌렀을떄
		btnNewButton.setBounds(53, 38, 181, 120);
		frame.getContentPane().add(btnNewButton);
	}

}
