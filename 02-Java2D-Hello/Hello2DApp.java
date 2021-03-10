import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hello2DApp {
    public static void main (String[] args) {
        Hello2DFrame frame = new Hello2DFrame();
        frame.setVisible(true);
    }
}

class Hello2DFrame extends JFrame {
    public Hello2DFrame () {
        this.addWindowListener (
            new WindowAdapter() {
                public void windowClosing (WindowEvent e) {
                    System.exit(0);
                }
            }
        );
        this.setTitle("Initial Drawing - Line/Elipse/Rectangle");
        this.setSize(500, 350);
    }

    public void paint (Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.red);
        this.setBackground(Color.black);
        int w = getWidth();
        int h = getHeight();
        g2d.drawLine(0,50, w,50);
        g2d.fillRect(70, 80, w - 100, 90);
        g2d.drawOval(120, 200, w - 200, 100 );

    }
}
