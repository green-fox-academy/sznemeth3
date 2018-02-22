import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowDots {

    static int WIDTH = 600;
    static int HEIGHT = 600;
    static int DOT_SIZE = 10;

    static int iterator = 0;


    public static void mainDraw(Graphics graphics) {
            for (int i = 0; i < 50; i++) {

                int radius =  iterator-(i*100);
                if (radius < WIDTH / 2 ) {
                    drawDotsOnACircle(graphics, radius);
                }
                if (radius > WIDTH)  {
                    iterator = 50;
                    continue;
                }

            }
        }

    private static void drawDotsOnACircle(Graphics graphics, int radius) {
        for (int angle = 0; angle < 360; angle+= 2) {
            double radian = Math.toRadians(angle);
            int positionX = (int)(WIDTH / 2 + (radius * Math.sin(radian)));
            int positionY = (int)(HEIGHT / 2 + (radius * Math.cos(radian)));

            graphics.setColor(getRandomColor(angle));
            graphics.fillOval(positionX, positionY, DOT_SIZE, DOT_SIZE);
        }
    }

    private static Color getRandomColor(int angle) {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r,g,b);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("My beautiful picture");
        ImagePanel imagePanel = new ImagePanel();

        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(imagePanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        imagePanel.setBackground(Color.black);

        while (true){
            imagePanel.repaint();
            Thread.sleep(100);
            iterator += 10;
            /*if(iterator==50) {
                iterator = 0;
                continue;
            }*/
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
