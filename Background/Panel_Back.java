package Background;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;



class ImagePanel extends JPanel{
	private Image img;//이미지 클래스 생성
	public ImagePanel(Image img) {
		this.img=img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));//get이 null값을 가지면 그냥 최대치를 가져옴
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));//안해주면 그냥 나오는데 이유가뭐냐??
	}
	public void paintComponent(Graphics g){//JPanel에는 panel에 백그라운드 이미지를 넣을 수 있께 하는 fucntion이 있음
		//패널이 열렸을 때 자동으로 비춰지는 것이라고 보면 됨, 파라미터는 Graphic 객체
		g.drawImage(img,0,0,null);
	}
}
public class Panel_Back {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		//frame.setSize(640,640/4*3); //pack을 할 것이므로 필요가 없음
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel imPanel=new ImagePanel(new ImageIcon("C:/Users/Kweon/eclipse-workspace/Swing/src/Background/image/13.png").getImage());//이미지를 빠르게 부르는법은 이미지 아이콘을 생성해서 거기서 이미지 추출, 경로지정
		frame.add(imPanel);
		frame.pack();//패널의 크기에 맞게 프레임이 조절됨
		frame.setLocationRelativeTo(null);//pack밑에 위치해야함(정중앙)
		java.io.File f=new File("C:/Users/Kweon/eclipse-workspace/Swing/src/Background/image/13.png");
		System.out.print(f.exists()?"Exits":"Doesnt Exists");

	}
}
