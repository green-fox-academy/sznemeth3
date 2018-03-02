import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Snowflake {
  static int WIDTH = 1500;
  static int HEIGHT = 1500;
  static int TRIANGLE_SIDE = 600;
  static double TRIANGLE_HEIGHT = Math.sqrt(Math.pow(TRIANGLE_SIDE, 2) - Math.pow(TRIANGLE_SIDE / 2, 2));
  static int TRIANGLE_BOTTOMY = 600;
  static int TRIANGLE_BOTTOMX = WIDTH/2-TRIANGLE_SIDE;
  private static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.WHITE);
    // https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png
    int[] x = new int[]{TRIANGLE_BOTTOMX, TRIANGLE_BOTTOMX+ TRIANGLE_SIDE / 2, TRIANGLE_BOTTOMX +TRIANGLE_SIDE};
    int[] y = new int[]{TRIANGLE_BOTTOMY, (int) (TRIANGLE_BOTTOMY - TRIANGLE_HEIGHT), TRIANGLE_BOTTOMY};
    /*int[] x2 = new int[]{TRIANGLE_BOTTOMX, TRIANGLE_BOTTOMX+ TRIANGLE_SIDE / 2, TRIANGLE_BOTTOMX +TRIANGLE_SIDE};
    int[] y2 = new int[]{TRIANGLE_BOTTOMY -(int)TRIANGLE_HEIGHT/3 *2, (int)(TRIANGLE_BOTTOMY -(int)TRIANGLE_HEIGHT/3 *2 + TRIANGLE_HEIGHT), TRIANGLE_BOTTOMY -(int)TRIANGLE_HEIGHT/3 *2};*/
    graphics.fillPolygon(x, y, 3);
    /*graphics.fillPolygon(x2, y2, 3);*/
    recurse(graphics,TRIANGLE_BOTTOMY,TRIANGLE_BOTTOMX,TRIANGLE_SIDE);
  }
  // Don't touch the code below
  public static void recurse(Graphics graphics, int startY, int startX, int triangeleSide) {
    if (triangeleSide < 10) {
    } else {
      double triangleHeight = Math.sqrt(Math.pow(triangeleSide, 2) - Math.pow(triangeleSide / 2, 2));
      int[] x1 = new int[]{startX,
              startX+ triangeleSide / 2,
              startX +triangeleSide};
      int[] y1 = new int[]{startY -(int)triangleHeight/3 *2,
              (int)(startY -(int)triangleHeight/3 *2 + triangleHeight),
              startY -(int)triangleHeight/3 *2};
      graphics.fillPolygon(x1, y1, 3);
      int[] x2 = new int[]{startX + triangeleSide/6 *3,
              startX + triangeleSide/6 *3+ triangeleSide / 2 / 2,
              startX + triangeleSide/6 *3 +triangeleSide / 2};
      int[] y2 = new int[]{startY -(int)triangleHeight/6 *2,
              (int)(startY -(int)triangleHeight/6 *2 - triangleHeight/2),
              startY -(int)triangleHeight/6 *2};
      graphics.fillPolygon(x2, y2, 3);
      int[] x3 = new int[]{startX ,
              startX + triangeleSide / 2 / 2,
              startX +triangeleSide / 2};
      int[] y3 = new int[]{startY -(int)triangleHeight/6 *2,
              (int)(startY -(int)triangleHeight/6 *2 - triangleHeight/2),
              startY -(int)triangleHeight/6 *2};
      graphics.fillPolygon(x2, y2, 3);
      int[] x4 = new int[]{startX + triangeleSide / 2  + triangeleSide / 2 /2,
              startX + triangeleSide / 2 ,
              startX + triangeleSide / 2  - triangeleSide / 2 /2};
      int[] y4 = new int[]{startY + (int)triangleHeight/6 *1,
              (int)(startY +(int)triangleHeight/6 *1 - triangleHeight/2),
              startY + (int)triangleHeight/6 *1};
      graphics.fillPolygon(x2, y2, 3);
      graphics.fillPolygon(x3, y3, 3);
      graphics.fillPolygon(x4, y4, 3);
      recurse(graphics, startY -(int)triangleHeight/6 *2, startX + triangeleSide/6 *3,triangeleSide / 2 );
      recurse(graphics,startY -(int)triangleHeight/6 *2, startX, triangeleSide /2 );
      recurse(graphics,startY + (int)triangleHeight/6 *1,startX + triangeleSide / 2  + triangeleSide / 2 /2,triangeleSide / 2 );



      /*recurse(graphics, startX-triangleHeight);
      recurse(graphics);
      recurse(graphics);*/
    }
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel imagePanel = new ImagePanel();
    jFrame.add(imagePanel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    imagePanel.setBackground(Color.black);

  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}