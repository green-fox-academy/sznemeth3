import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagon {
  static int STARTPOSIOTION_X = 0;
  static int STARTPOSIOTION_Y = 350;
  static int HEXAGON_SIDE = 400;
  static int HEXAGON_INNER_HEIGHT = (int) Math.sqrt(Math.pow(HEXAGON_SIDE, 2) - Math.pow(HEXAGON_SIDE / 2, 2));
  static int ITERATOR = 0;

  private static void mainDraw(Graphics graphics) {
    //recurse(graphics, 0,0,WIDTH / 3,HEIGHT / 3);
    int[] yValues = new int[]{((STARTPOSIOTION_Y)),
            (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT),
            (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT),
            STARTPOSIOTION_Y,
            (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT),
            (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT)};
    int[] xValues = new int[]{STARTPOSIOTION_X,
            (STARTPOSIOTION_X + HEXAGON_SIDE / 2),
            (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE),
            (STARTPOSIOTION_X + 2 * HEXAGON_SIDE),
            (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE),
            (STARTPOSIOTION_X + HEXAGON_SIDE / 2)};
    graphics.setColor(getRandomColor());
    graphics.fillPolygon(xValues, yValues, 6);

    recurse(graphics, STARTPOSIOTION_Y, STARTPOSIOTION_X, HEXAGON_SIDE , HEXAGON_INNER_HEIGHT, 1);


  }

  public static void recurse(Graphics graphics, int startY, int startX, int hexagonSide, int height, int iterator) {
    if (hexagonSide < 1) {

    } else if (iterator < ITERATOR) {
      int hexagonHeight = (int) Math.sqrt(Math.pow(hexagonSide, 2) - Math.pow(hexagonSide / 2, 2));
      Random r = new Random();
      /*int[] yValues1 = new int[]{((startY) - height / 2),
              (startY - height / 2 - hexagonHeight),
              (startY - height / 2 - hexagonHeight),
              startY - height / 2,
              (startY - height / 2 + hexagonHeight),
              (startY - height / 2 + hexagonHeight)};
      int[] xValues1 = new int[]{startX + ((hexagonSide / 2)),
              (startX + (hexagonSide / 2) + hexagonSide / 2),
              (startX + (hexagonSide / 2) + hexagonSide / 2 + hexagonSide),
              (startX + (hexagonSide / 2) + 2 * hexagonSide),
              (startX + (hexagonSide / 2) + hexagonSide / 2 + hexagonSide),
              (startX + (hexagonSide / 2) + hexagonSide / 2)};*/
      graphics.setColor(getRandomColor());
      /*graphics.fillPolygon(xValues1, yValues1, 6);*/
      magicMethod(graphics, startY-height/3*2, startX + hexagonSide , hexagonSide /3);
      magicMethod(graphics, startY-height/3*2, startX + hexagonSide/3 , hexagonSide /3);
      magicMethod(graphics, startY +height/3*2, startX + hexagonSide/3, hexagonSide /3);
      magicMethod(graphics, startY, startX + 2 * hexagonSide - hexagonSide*2/3, hexagonSide /3);
      magicMethod(graphics, startY, startX, hexagonSide /3);
      magicMethod(graphics, startY +height/3*2, startX + hexagonSide, hexagonSide /3);

      int hexagonHeight2 = (int) Math.sqrt(Math.pow(hexagonSide /3, 2) - Math.pow(hexagonSide /3 / 2, 2));
      recurse(graphics, startY-hexagonHeight2/3*2, startX + hexagonSide/3 , hexagonSide /3,hexagonHeight, iterator + 10);
      recurse(graphics, startY +hexagonHeight2/3*2, startX + hexagonSide/3 , hexagonSide /3,hexagonHeight, iterator + 10);
      recurse(graphics, startY, startX + 2 * hexagonSide - hexagonSide*2/3, hexagonSide /3,hexagonHeight, iterator + 10);
      recurse(graphics, startY, startX, hexagonSide /3,hexagonHeight, iterator + 10);
      recurse(graphics, startY +hexagonHeight2/3*2, startX + hexagonSide, hexagonSide /3,hexagonHeight, iterator + 10);
      recurse(graphics, startY-hexagonHeight/3*2, startX + hexagonSide , hexagonSide /3,hexagonHeight,  + 1);
    }
  }
  private static void magicMethod (Graphics graphics, int startY, int startX, int hexagonSide) {
    int hexagonHeight = (int) Math.sqrt(Math.pow(hexagonSide, 2) - Math.pow(hexagonSide / 2, 2));
    int[] yValues1 = new int[]{((startY)),
            (startY  - hexagonHeight),
            (startY - hexagonHeight),
            startY ,
            (startY  + hexagonHeight),
            (startY  + hexagonHeight)};
    int[] xValues1 = new int[]{startX ,
            (startX  + hexagonSide / 2),
            (startX + + hexagonSide / 2 + hexagonSide),
            (startX  + 2 * hexagonSide),
            (startX  + hexagonSide / 2 + hexagonSide),
            (startX  + hexagonSide / 2)};
    graphics.setColor(getRandomColor());
    graphics.fillPolygon(xValues1, yValues1, 6);


  }
  private static Color getRandomColor() {
    Random random = new Random();
    int r = random.nextInt(256);
    int g = random.nextInt(256);
    int b = random.nextInt(256);
    return new Color(r, g, b);
  }

  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

  public static void main(String[] args) throws InterruptedException {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel imagePanel = new ImagePanel();
    jFrame.add(imagePanel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);

    while (true) {
      imagePanel.repaint();
      Thread.sleep(1000);
      ITERATOR += 5;
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