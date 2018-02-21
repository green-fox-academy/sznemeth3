import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x =0;
        int y = 0;
        for (int i = 0; i < WIDTH-19; i+=20) {
            for (int j = 0; j < 2; j++) {
                if (j==0) {
                    drawALine(i,j,graphics);
                }
                else {
                    drawALine(i,j*HEIGHT,graphics);
                }
            }
        }
        for (int j  = 0; j < HEIGHT; j+=20) {
            for (int i = 0; i < 2; i++) {
                if (i==0) {
                    drawALine(i,j,graphics);
                }
                else {
                    drawALine(i*WIDTH,j,graphics);
                }
            }
        }

        //drawALine(x,y);


    }
    public static void   drawALine(int x, int y, Graphics graphics) {
        graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}