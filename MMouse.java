import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class MMouse extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.green);

		Ellipse2D.Double circle = new Ellipse2D.Double(100, 50, 200, 200);
		g2.fill(circle);
		
		
	}
}
