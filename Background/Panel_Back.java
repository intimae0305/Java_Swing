package Background;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



class ImagePanel extends JPanel{
	private Image img;//�̹��� Ŭ���� ����
	public ImagePanel(Image img) {
		this.img=img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));//get�� null���� ������ �׳� �ִ�ġ�� ������
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));//�����ָ� �׳� �����µ� ����������??
	}
	public void paintComponent(Graphics g){//JPanel���� panel�� ��׶��� �̹����� ���� �� �ֲ� �ϴ� fucntion�� ����
		//�г��� ������ �� �ڵ����� �������� ���̶�� ���� ��, �Ķ���ʹ� Graphic ��ü
		g.drawImage(img,0,0,null);
	}
}
public class Panel_Back {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		//frame.setSize(640,640/4*3); //pack�� �� ���̹Ƿ� �ʿ䰡 ����
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel imPanel=new ImagePanel(new ImageIcon("C:/Users/Kweon/eclipse-workspace/Swing/src/Background/image/13.png").getImage());//�̹����� ������ �θ��¹��� �̹��� �������� �����ؼ� �ű⼭ �̹��� ����, �������
		frame.add(imPanel);
		frame.pack();//�г��� ũ�⿡ �°� �������� ������
		frame.setLocationRelativeTo(null);//pack�ؿ� ��ġ�ؾ���(���߾�)
		java.io.File f=new File("C:/Users/Kweon/eclipse-workspace/Swing/src/Background/image/13.png");
		System.out.print(f.exists()?"Exits":"Doesnt Exists");

	}
}
