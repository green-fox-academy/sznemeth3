import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i%2==0) {
                    if (j%2==0) {
                        graphics.setColor(Color.BLACK);
                        graphics.fillRect((WIDTH / 8) * i, (WIDTH / 8) * j, WIDTH / 8, WIDTH / 8);
                    }
                    else {
                        graphics.setColor(Color.WHITE);
                        graphics.fillRect((WIDTH / 8) * i, (WIDTH / 8) * j, WIDTH / 8, WIDTH / 8);
                    }
                }
                else {
                    if (j%2==0) {
                        graphics.setColor(Color.WHITE);
                        graphics.fillRect((WIDTH / 8) * i, (WIDTH / 8) * j, WIDTH / 8, WIDTH / 8);
                    }
                    else {
                        graphics.setColor(Color.BLACK);
                        graphics.fillRect((WIDTH / 8) * i, (WIDTH / 8) * j, WIDTH / 8, WIDTH / 8);
                    }
                    }

            }

        }

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