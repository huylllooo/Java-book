package Chapter4;
import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		DrawPanel panel = new DrawPanel();
		// Panel must be placed in a window (from javax.swing)
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(250, 250);
		application.setVisible(true);

	}

}
