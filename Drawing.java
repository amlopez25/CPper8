import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import javax.swing.JComponent;

public class Drawing extends JComponent{

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
        
		g2.setColor(Color.green);

		
        Ellipse2D.Double circle = new Ellipse2D.Double(100, 20, 200, 200);
		g2.fill(circle);
		
		g2.setColor(Color.white);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(150, 30, 100, 100);
		g2.fill(circle2);

		g2.setColor(Color.black);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(170, 50, 60, 60);
		g2.fill(circle3);
        
        g2.setColor(Color.green);
        Ellipse2D.Double circle4 = new Ellipse2D.Double(340, 110, 40, 40);
        g2.fill(circle4);
        
        
        g2.setColor(Color.green);
        Ellipse2D.Double circle5 = new Ellipse2D.Double(30, 110, 40, 40);
        g2.fill(circle5);
        
        g2.setColor(Color.green);
        Rectangle box = new Rectangle(52, 125, 50, 10);
        g2.fill(box);
        
        g2.setColor(Color.green);
        Rectangle box2 = new Rectangle(298, 125, 50, 10);
        g2.fill(box2);
        
        int xPoly[] = {250,260,250,275,260};
        int yPoly[] = {200,250,310,250,200};
        
        g2.setColor(Color.green);
        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        g2.fill(poly);
        
        int xPoly1[] = {150,140,148,125,140};
        int yPoly1[] = {200,250,310,250,200};
        
        g2.setColor(Color.green);
        Polygon poly2 = new Polygon(xPoly1, yPoly1, xPoly1.length);
        g2.fill(poly2);
        
        int xPoly2[] = {150,150,140,135,120,105,110,100};
        int yPoly2[] = {300,325,313,335,318,330,308,300};
        
        g2.setColor(Color.green);
        Polygon poly3 = new Polygon(xPoly2, yPoly2, xPoly2.length);
        g2.fill(poly3);
        
        int xPoly3[] = {250,250,260,265,280,295,290,300};
        int yPoly3[] = {300,325,313,335,318,330,308,300};
        
        g2.setColor(Color.green);
        Polygon poly4 = new Polygon(xPoly3, yPoly3, xPoly3.length);
        g2.fill(poly4);
        
        int xPoly4[] = {140,120,150};
        int yPoly4[] = {50,30,35};
        
        g2.setColor(Color.gray);
        Polygon poly5 = new Polygon(xPoly4, yPoly4, xPoly4.length);
        g2.fill(poly5);
        
        int xPoly5[] = {260,280,250};
        int yPoly5[] = {50,30,35};
        
        g2.setColor(Color.gray);
        Polygon poly6 = new Polygon(xPoly5, yPoly5, xPoly5.length);
        g2.fill(poly6);
        
        int xPoly6[] = {160,170,180,190,200,210,220};
        int yPoly6[] = {175,185,175,185,175,185,175};
        
        g2.setColor(Color.white);
        Polygon poly7 = new Polygon(xPoly6, yPoly6, xPoly6.length);
        g2.fill(poly7);
        
        int xPoly7[] = {350,355,360};
        int yPoly7[] = {115,100,110};
        
        g2.setColor(Color.gray);
        Polygon poly8 = new Polygon(xPoly7, yPoly7, xPoly7.length);
        g2.fill(poly8);
        
        int xPoly8[] = {380,390,375};
        int yPoly8[] = {125,135,140};
        
        g2.setColor(Color.gray);
        Polygon poly9 = new Polygon(xPoly8, yPoly8, xPoly8.length);
        g2.fill(poly9);
        
        int xPoly9[] = {353,359,364};
        int yPoly9[] = {150,160,150};
        
        g2.setColor(Color.gray);
        Polygon poly10 = new Polygon(xPoly9, yPoly9, xPoly9.length);
        g2.fill(poly10);
        
        int xPoly10[] = {55,50,45};
        int yPoly10[] = {150,160,150};
        
        g2.setColor(Color.gray);
        Polygon poly11 = new Polygon(xPoly10, yPoly10, xPoly10.length);
        g2.fill(poly11);
        
        int xPoly11[] = {25,35,30};
        int yPoly11[] = {145,140,135};
        
        g2.setColor(Color.gray);
        Polygon poly12 = new Polygon(xPoly11, yPoly11, xPoly11.length);
        g2.fill(poly12);
        
        int xPoly12[] = {50,45,40};
        int yPoly12[] = {110,100,113};
        
        g2.setColor(Color.gray);
        Polygon poly13 = new Polygon(xPoly12, yPoly12, xPoly12.length);
        g2.fill(poly13);
    
            
    
        }
}
