import java.awt.Container;
import javax.swing.*;

class SnowDrop extends Thread {
	private int x,y;
	private Snow snow = new Snow();
	private Container contentPane;
			
	SnowDrop(Container contentPane) {
		contentPane = contentPane.getParent();
		this.contentPane = contentPane;
	}
	
	public void run() {
		x = (int)(Math.random()*contentPane.getWidth())-30;
		y = (int)(Math.random()*contentPane.getHeight())-30;
		snow.setLayout(null);
		snow.setSize(50, 50);
		snow.setLocation(x, y);
		contentPane.add(snow);
		//contentPane.repaint();
		
		while(true) {
			y+=10;
			snow.setLocation(x, y);
			contentPane.repaint();
			try {
				Thread.sleep(300);
				if(y > contentPane.getHeight()) {
					return;
				}
			}
			catch(InterruptedException e) { return; }
		}
	}
}