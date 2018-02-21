import javax.swing.*;

import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int [][] arrayPoints = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        drawToCenter(arrayPoints, graphics);
    }
    public static void drawToCenter(int[][] array,Graphics graphics) {
        int [] firstElement = new int[array.length];
        int [] secondElement = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (j==0){
                    firstElement[i] = array[i][j];
                }
                else {
                    secondElement[i] = array[i][j];
                }
            }

        }
        graphics.drawPolyline(firstElement,secondElement,array.length );
    }

    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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

