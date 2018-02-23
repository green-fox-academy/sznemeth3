import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    static int TRIANGLE_SIDE = 400;
    static double TRIANGLE_HEIGHT = Math.sqrt(Math.pow(TRIANGLE_SIDE, 2) - Math.pow(TRIANGLE_SIDE / 2, 2));
    static int TRIANGLE_BOTTOMY = 400;

    public static void mainDraw(Graphics graphics) {
        int[] x = new int[]{0, TRIANGLE_SIDE / 2, TRIANGLE_SIDE};
        int[] y = new int[]{TRIANGLE_BOTTOMY, (int) (TRIANGLE_BOTTOMY - TRIANGLE_HEIGHT), TRIANGLE_BOTTOMY};
        //Draw base triangle
        graphics.drawPolygon(x, y, 3);
        for (int i = 1; i < 21; i += 1) {
            graphics.drawLine(0 + (i * TRIANGLE_SIDE / 21), TRIANGLE_BOTTOMY, TRIANGLE_SIDE / 2 + i * TRIANGLE_SIDE / 42,
                    (int) (TRIANGLE_BOTTOMY - TRIANGLE_HEIGHT) + (int) (i * (TRIANGLE_HEIGHT / 21)));
        }
        for (int i = 1; i < 21; i += 1) {
            graphics.drawLine( 0 + (i * TRIANGLE_SIDE / 21), TRIANGLE_BOTTOMY,  0 + i * TRIANGLE_SIDE / 42,
                    TRIANGLE_BOTTOMY - (int) (i * (TRIANGLE_HEIGHT / 21)));
        }
        for (int i = 1; i < 21; i += 1) {
            graphics.drawLine((TRIANGLE_SIDE / 2 + i * TRIANGLE_SIDE / 42),
                    (int) (TRIANGLE_BOTTOMY - TRIANGLE_HEIGHT) + (int) (i * (TRIANGLE_HEIGHT / 21)),
                    TRIANGLE_SIDE / 2 - i * TRIANGLE_SIDE / 42,
                    (int) (TRIANGLE_BOTTOMY - TRIANGLE_HEIGHT) + (int) (i * (TRIANGLE_HEIGHT / 21)));
        }

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
