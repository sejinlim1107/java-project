import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.*;

public class ImageRoad extends JPanel {
	private ImageIcon icon = new ImageIcon("a.jpg");
	private Image img = icon.getImage();

	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
	}
}
