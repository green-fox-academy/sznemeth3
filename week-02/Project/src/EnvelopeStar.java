import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class EnvelopeStar {
    static int STAR_WIDTH = 400;

    public static void mainDraw(Graphics graphics){
        //graphics.drawLine(0,STAR_WIDTH/2,STAR_WIDTH,STAR_WIDTH/2);
        graphics.drawLine(STAR_WIDTH/2,0,STAR_WIDTH/2,STAR_WIDTH);
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(STAR_WIDTH/2,0+STAR_WIDTH/28*i,STAR_WIDTH/2+STAR_WIDTH/28*i,STAR_WIDTH/2);
        }
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(STAR_WIDTH/2,0+STAR_WIDTH/28*i,STAR_WIDTH/2-STAR_WIDTH/28*i,STAR_WIDTH/2);
        }
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(STAR_WIDTH/2,STAR_WIDTH-STAR_WIDTH/28*i,STAR_WIDTH/2-STAR_WIDTH/28*i,STAR_WIDTH/2);
        }
        for (int i = 0; i < 15; i++) {
            graphics.drawLine(STAR_WIDTH/2,STAR_WIDTH-STAR_WIDTH/28*i,STAR_WIDTH/2+STAR_WIDTH/28*i,STAR_WIDTH/2);
        }
    }


    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}

