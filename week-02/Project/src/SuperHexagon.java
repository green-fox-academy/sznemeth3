import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class SuperHexagon {
    static int STARTPOSIOTION_X = 100;
    static int STARTPOSIOTION_Y = 150;
    static int HEXAGON_SIDE = 20;
    static int HEXAGON_INNER_HEIGHT = (int) Math.sqrt(Math.pow(HEXAGON_SIDE, 2) - Math.pow(HEXAGON_SIDE / 2, 2));
    static int iterator = 0;

    public static void mainDraw(Graphics graphics) {
        for (int columnCounter = -3; columnCounter < 4; columnCounter++) {
            if (columnCounter == 0) {
                for (int rowCounter = -3; rowCounter < 4; rowCounter++) {
                    graphics.setColor(getRandomColor());
                    graphics.fillPolygon(drawHexagonX(columnCounter), drawHexagonY(rowCounter, columnCounter), 6);
                }
            } else if (columnCounter < 0) {
                for (int rowCounter = -3 - columnCounter; rowCounter < 4; rowCounter++) {
                    graphics.setColor(getRandomColor());
                    graphics.fillPolygon(drawHexagonX(columnCounter), drawHexagonY(rowCounter, columnCounter), 6);
                }
            } else {
                for (int rowCounter = -3; rowCounter < 4 - columnCounter; rowCounter++) {
                    graphics.setColor(getRandomColor());
                    graphics.fillPolygon(drawHexagonX(columnCounter), drawHexagonY(rowCounter, columnCounter), 6);
                }
            }
        }
    }

    private static int[] drawHexagonY(int rowCounter, int columnCounter) {
        int[] yValues = new int[]{((STARTPOSIOTION_Y) - (rowCounter * HEXAGON_INNER_HEIGHT * 2)) - (columnCounter * HEXAGON_INNER_HEIGHT),
                (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT) - (rowCounter * HEXAGON_INNER_HEIGHT * 2) - (columnCounter * HEXAGON_INNER_HEIGHT),
                (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT) - (rowCounter * HEXAGON_INNER_HEIGHT * 2) - (columnCounter * HEXAGON_INNER_HEIGHT),
                STARTPOSIOTION_Y - (rowCounter * HEXAGON_INNER_HEIGHT * 2) - (columnCounter * HEXAGON_INNER_HEIGHT),
                (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT) - (rowCounter * HEXAGON_INNER_HEIGHT * 2) - (columnCounter * HEXAGON_INNER_HEIGHT),
                (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT) - (rowCounter * HEXAGON_INNER_HEIGHT * 2) - (columnCounter * HEXAGON_INNER_HEIGHT)};
        return yValues;
    }

    private static int[] drawHexagonX(int columnCounter) {
        int[] xValues = new int[]{STARTPOSIOTION_X - (columnCounter * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                (STARTPOSIOTION_X + HEXAGON_SIDE / 2) - (columnCounter * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE) - (columnCounter * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                (STARTPOSIOTION_X + 2 * HEXAGON_SIDE) - (columnCounter * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE) - (columnCounter * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                (STARTPOSIOTION_X + HEXAGON_SIDE / 2) - (columnCounter * (HEXAGON_SIDE / 2 + HEXAGON_SIDE))};
        return xValues;
    }
    private static Color getRandomColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r,g,b);
    }
    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel imagePanel = new ImagePanel();
        jFrame.add(imagePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        imagePanel.setBackground(Color.black);

        while (true) {
            imagePanel.repaint();
            Thread.sleep(1000);
            iterator += 1;
        }
    }
    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}
