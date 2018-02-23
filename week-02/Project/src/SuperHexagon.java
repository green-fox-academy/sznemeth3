import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class SuperHexagon {
    static int STARTPOSIOTION_X = 100;
    static int STARTPOSIOTION_Y = 150;
    static int HEXAGON_SIDE = 20;
    static int HEXAGON_INNER_HEIGHT = (int)Math.sqrt(Math.pow(HEXAGON_SIDE,2)-Math.pow(HEXAGON_SIDE/2,2));


    public static void mainDraw(Graphics graphics){
        for (int j = -3; j < 4; j++) {
            if (j==0) {
            for (int i = -3; i < 4; i++) {

                //System.out.println(i);
                int[] x = new int[]{STARTPOSIOTION_X - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                        (STARTPOSIOTION_X + HEXAGON_SIDE / 2) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                        (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                        (STARTPOSIOTION_X + 2 * HEXAGON_SIDE) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                        (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                        (STARTPOSIOTION_X + HEXAGON_SIDE / 2) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE))};
                int[] y = new int[]{((STARTPOSIOTION_Y) - (i * HEXAGON_INNER_HEIGHT * 2)) - (j * HEXAGON_INNER_HEIGHT),
                        (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                        (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                        STARTPOSIOTION_Y - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                        (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                        (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT)};
                graphics.drawPolygon(x, y, 6);
            }
            }
            if (j< 0) {
                for (int i = -3-j; i < 4; i++) {

                    //System.out.println(i);
                    int[] x = new int[]{STARTPOSIOTION_X - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                            (STARTPOSIOTION_X + HEXAGON_SIDE / 2) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                            (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                            (STARTPOSIOTION_X + 2 * HEXAGON_SIDE) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                            (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                            (STARTPOSIOTION_X + HEXAGON_SIDE / 2) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE))};
                    int[] y = new int[]{((STARTPOSIOTION_Y) - (i * HEXAGON_INNER_HEIGHT * 2)) - (j * HEXAGON_INNER_HEIGHT),
                            (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                            (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                            STARTPOSIOTION_Y - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                            (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                            (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT)};
                    graphics.drawPolygon(x, y, 6);
                }
            }
                        if (j> 0) {
                            for (int i = -3; i < 4-j ; i++) {

                                //System.out.println(i);
                                int[] x = new int[]{STARTPOSIOTION_X - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                                        (STARTPOSIOTION_X + HEXAGON_SIDE / 2) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                                        (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                                        (STARTPOSIOTION_X + 2 * HEXAGON_SIDE) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                                        (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE)),
                                        (STARTPOSIOTION_X + HEXAGON_SIDE / 2) - (j * (HEXAGON_SIDE / 2 + HEXAGON_SIDE))};
                                int[] y = new int[]{((STARTPOSIOTION_Y) - (i * HEXAGON_INNER_HEIGHT * 2)) - (j * HEXAGON_INNER_HEIGHT),
                                        (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                                        (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                                        STARTPOSIOTION_Y - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                                        (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT),
                                        (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT) - (i * HEXAGON_INNER_HEIGHT * 2) - (j * HEXAGON_INNER_HEIGHT)};
                                graphics.drawPolygon(x, y, 6);
                            }
                }
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
