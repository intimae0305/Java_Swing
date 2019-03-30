package Test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

class ImagePanel extends JPanel{
	Image img;
	public ImagePanel(Image img) {
		this.img=img;
		setSize(img.getWidth(null),img.getHeight(null));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
	}
	public void paintComponent(Graphics g) {
		g.drawImage(img,0,0,null);
	}
}

public class Test {
	public static void main(String args[]) {
		JFrame frame=new JFrame();
		JLabel label=new JLabel("id : ");
		JTextField txtField=new JTextField(10);
		ImagePanel imgPanel=new ImagePanel(new ImageIcon("C:/Users/Kweon/eclipse-workspace/Swing/src/Background/image/13.png").getImage());
		File f=new File("C:\\Users\\Kweon\\eclipse-workspace\\Swing\\src\\Background\\image");
		System.out.print(f.exists()?"exist":"Nope");
		frame.add(imgPanel);
		imgPanel.add(label);
		imgPanel.add(txtField);
		
		
		

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
	}
}