import java.awt.Container;
import javax.swing.JPanel;

public class CreateSnow extends Thread {
	private Container contentPane;
	
	public CreateSnow(Container contentPane) {
		this.contentPane = contentPane;
	}
	
	public void run() {
		while(true) { 
			try {
				new SnowDrop(contentPane).start();
				
				Thread.sleep(300);
			}
			catch(InterruptedException e) { return; }
		}
	}
}