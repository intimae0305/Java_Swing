package Test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
		JFrame frame=new JFrame("Image Background");
		frame.setLayout(new BorderLayout());
		
		JPanel tablePanel=new JPanel();
		tablePanel.setLayout(new BorderLayout());
		String[] headings=new String[] {"id","name","country"};
		Object[][] data=new Object[][] {
			{"1","Danniel","Korea"},
			{"1","Danniel","Korea"},
			{"1","Danniel","Korea"},
			{"1","Danniel","Korea"},
			{"1","Danniel","Korea"},
			{"1","Danniel","Korea"},
			{"1","Danniel","Korea"},
			{"1","Danniel","Korea"},
			{"2","John","France"},
			{"3","Sunny","Japan"}			
		};
		JTable table=new JTable(data,headings);
		table.setPreferredScrollableViewportSize(new Dimension(100,100/4*3));
		table.setFillsViewportHeight(true);
		tablePanel.add(new JScrollPane(table),BorderLayout.SOUTH);
		frame.add(tablePanel,BorderLayout.EAST);
		
		ImagePanel imgPanel=new ImagePanel(new ImageIcon("C:/Users/Kweon/eclipse-workspace/Swing/src/Background/image/13.png").getImage());
		frame.add(imgPanel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800/4*3);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);		
	}
}