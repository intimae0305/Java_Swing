package WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson3 window = new Lesson3();
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
	public Lesson3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Lesson 6");
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JPanel sPanel = new JPanel();
		JPanel fPanel = new JPanel();
		sPanel.setBounds(0, 0, 694, 466);
		frame.getContentPane().add(sPanel);
		sPanel.setLayout(null);
		JButton NBtn = new JButton("Go to Before");
		NBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sPanel.setVisible(false);
				fPanel.setVisible(true);
			}
		});
		NBtn.setFont(new Font("±Ã¼­", Font.BOLD | Font.ITALIC, 18));
		NBtn.setBounds(484, 108, 101, 325);
		sPanel.add(NBtn);
		

		fPanel.setBounds(0, 0, 694, 466);
		frame.getContentPane().add(fPanel);
		fPanel.setLayout(null);
		
		JButton BBtn = new JButton("Go to Next");
		BBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sPanel.setVisible(true);
				fPanel.setVisible(false);
			}
		});
		BBtn.setBounds(193, 70, 91, 23);
		fPanel.add(BBtn);
		fPanel.setVisible(false);
	}
}
