import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class DemoPresentation {
    static int TRIANGLE_SIDE = 20;
    static double TRIANGLE_HEIGHT = Math.sqrt(Math.pow(TRIANGLE_SIDE, 2) - Math.pow(TRIANGLE_SIDE / 2, 2));
    static int TRIANGLE_BOTTOMY = 300;

    public static void mainDraw(Graphics graphics) {
        int[] x = new int[]{100, 100+ TRIANGLE_SIDE / 2, 100 +TRIANGLE_SIDE};
        int[] y = new int[]{TRIANGLE_BOTTOMY, (int) (TRIANGLE_BOTTOMY - TRIANGLE_HEIGHT), TRIANGLE_BOTTOMY};
        graphics.drawPolygon(x, y, 3);
        int[] x2 = new int[]{100+TRIANGLE_SIDE, 100+TRIANGLE_SIDE+ TRIANGLE_SIDE / 2, 100+TRIANGLE_SIDE +TRIANGLE_SIDE};
        int[] y2 = new int[]{TRIANGLE_BOTTOMY, (int) (TRIANGLE_BOTTOMY - TRIANGLE_HEIGHT), TRIANGLE_BOTTOMY};
        graphics.drawPolygon(x2,y2,3);
    }

    //    Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
