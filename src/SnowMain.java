import java.awt.*;
import javax.swing.*;
import java.util.Vector;
import java.math.*;

public class SnowMain extends JFrame {
	private ImageRoad imgr = new ImageRoad();
	public SnowMain() { //������
		setTitle("�� ������ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setContentPane(imgr);
		Container contentpane = getContentPane();
		contentpane.setLayout(null);
		
		CreateSnow th = new CreateSnow(imgr); //������ ����(Label �Ű����� ����)
		th.start();
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new SnowMain();
	}
}