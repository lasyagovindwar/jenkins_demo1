import java.applet.*;
import java.awt.*;
/* <applet code="AppletDemo2.class" width="400" height="400">
</applet> */
public class AppletDemo2 extends Applet {
    public void paint(Graphics g) {
        // Draw a string
        g.drawString("Hello World!", 150, 50);
        
        // Draw a circle (oval with equal width and height)
        g.setColor(Color.BLUE);
        g.fillOval(200, 400, 100, 150); // x, y, width, height (fits inside rectangle)
        
       g.setColor(Color.BLACK);
        g.drawRect(250, 150, 250, 150); // x, y, width, height
        
        // Draw a rectangle
        g.drawRect(200, 400, 100, 150); // x, y, width, height
        
        // Draw a line
        g.drawLine(150, 200, 150, 350); // x1, y1, x2, y2
        g.setColor(Color.GREEN);
        g.fillOval(300,350,200,250);
    }
}
