
import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class HorizontalLines {
        public static void mainDraw(Graphics graphics) {
            // Create a line drawing function that takes 2 parameters:
            // The x and y coordinates of the line's starting point
            // and draws a 50 long horizontal line from that point.
            // Draw 3 lines with that function. Use loop for that.
            int x = 0;
            int y = 0;
            Random r = new Random();
            for (int i = 0; i < 3; i++) {
                draw(x + r.nextInt(311),y + r.nextInt(311),graphics);
            }



        }
        public static void draw (int x, int y, Graphics graphics) {
            graphics.drawLine(x,y,x+50,y);
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
