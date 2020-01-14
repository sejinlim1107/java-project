import java.awt.*;
import javax.swing.*;
import java.util.Vector;
import java.math.*;

public class SnowMain extends JFrame {
	private ImageRoad imgr = new ImageRoad();
	public SnowMain() { //생성자
		setTitle("눈 내리는 샤갈의 마을");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(imgr);
		Container contentpane = getContentPane();
		contentpane.setLayout(null);
		
		CreateSnow th = new CreateSnow(imgr); //스레드 생성(Label 매개변수 전달)
		th.start();
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new SnowMain();
	}
}