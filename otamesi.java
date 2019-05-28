import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

// this file is an otamesi program to write some geometries on JFrame
public class otamesi {
    public static void main(String[] args) {
        GameWindow gw = new GameWindow("test window", 400, 300);
        gw.add(new DrawCanvas());
        gw.setVisible(true);
    }
}

// window class
class GameWindow extends JFrame {
    // override GameWindow function of JFrame
    public GameWindow(String title, int width, int height) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}

// paper to write some graph
class DrawCanvas extends JPanel {
    // override paintComponent function of JPanel
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Colors.GREEN);

        // string
        g.drawLine(100, 100, 200, 200);

        // frame of rectangle
        g.drawRect(0, 0, 50, 50);

        // filled rectanglee
        g.fillRect(100, 0, 50, 50);

        // frame of oval
        g.drawOval(100, 150, 50, 50);

        // filled oval
        g.fillOval(200, 150, 50, 50);

        // frame of polygon
        g.drawPolygon(new int[] {125,150,100}, new int[] {100,150,150}, 3);

        // filled polygon
        g.fillPolygon(new int[] {225,250,200}, new int[] {100,150,150}, 3);

        // polyline
        g.drawPolyline(new int[] {225,250}, new int[] {200,250}, 2);
    }
}

// color set
class Colors {
    public static final Color WHITE = new Color(255, 255, 255);
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color RED = new Color(255, 0, 0);
    public static final Color GREEN = new Color(0, 255, 0);
    public static final Color BLUE = new Color(0, 0, 255);
}