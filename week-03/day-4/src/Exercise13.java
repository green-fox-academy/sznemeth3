import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise13{
    static int STARTPOSIOTION_X = 0;
    static int STARTPOSIOTION_Y = 350;
    static int HEXAGON_SIDE = 200;
    static int HEXAGON_INNER_HEIGHT = (int) Math.sqrt(Math.pow(HEXAGON_SIDE, 2) - Math.pow(HEXAGON_SIDE / 2, 2));
  private static void mainDraw(Graphics graphics) {
    //recurse(graphics, 0,0,WIDTH / 3,HEIGHT / 3);
    int[] yValues = new int[]{((STARTPOSIOTION_Y)),
            (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT),
            (STARTPOSIOTION_Y - HEXAGON_INNER_HEIGHT),
            STARTPOSIOTION_Y ,
            (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT) ,
            (STARTPOSIOTION_Y + HEXAGON_INNER_HEIGHT)};
    int[] xValues = new int[]{STARTPOSIOTION_X ,
            (STARTPOSIOTION_X + HEXAGON_SIDE / 2),
            (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE),
            (STARTPOSIOTION_X + 2 * HEXAGON_SIDE) ,
            (STARTPOSIOTION_X + HEXAGON_SIDE / 2 + HEXAGON_SIDE) ,
            (STARTPOSIOTION_X + HEXAGON_SIDE / 2) };
    graphics.drawPolygon(xValues,yValues,6);
    recurse(graphics,STARTPOSIOTION_Y,STARTPOSIOTION_X, HEXAGON_SIDE/2, HEXAGON_INNER_HEIGHT);

  }
  public static void recurse (Graphics graphics, int startY, int startX, int hexagonSide, int height){
    if (hexagonSide < 10){

    } else {
      int hexagonHeight = (int) Math.sqrt(Math.pow(hexagonSide, 2) - Math.pow(hexagonSide / 2, 2));
      int[] yValues1 = new int[]{((startY) - height / 2),
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
              (startX + (hexagonSide / 2) + hexagonSide / 2)};
      graphics.drawPolygon(xValues1, yValues1, 6);
      recurse(graphics, ((startY) - height / 2), startX + (hexagonSide / 2), hexagonSide / 2, hexagonHeight);
      int[] yValues2 = new int[]{((startY)),
              (startY - hexagonHeight),
              (startY - hexagonHeight),
              startY,
              (startY + hexagonHeight),
              (startY + hexagonHeight)};
      int[] xValues2 = new int[]{startX + hexagonSide * 2,
              (startX + hexagonSide * 2 + hexagonSide / 2),
              (startX + hexagonSide * 2 + hexagonSide / 2 + hexagonSide),
              (startX + hexagonSide * 2 + 2 * hexagonSide),
              (startX + hexagonSide * 2 + hexagonSide / 2 + hexagonSide),
              (startX + hexagonSide * 2 + hexagonSide / 2)};
      graphics.drawPolygon(xValues2, yValues2, 6);
      recurse(graphics, startY, startX + hexagonSide * 2, hexagonSide / 2, hexagonHeight);
      int[] yValues3 = new int[]{((startY) + height / 2),
              (startY - hexagonHeight + height / 2),
              (startY - hexagonHeight + height / 2),
              startY + height / 2,
              (startY + hexagonHeight + height / 2),
              (startY + hexagonHeight) + height / 2};
      int[] xValues3 = new int[]{startX + ((hexagonSide / 2)),
              (startX + ((hexagonSide / 2) + hexagonSide / 2)),
              (startX + ((hexagonSide / 2) + hexagonSide / 2 + hexagonSide)),
              (startX + ((hexagonSide / 2) + 2 * hexagonSide)),
              (startX + ((hexagonSide / 2) + hexagonSide / 2 + hexagonSide)),
              (startX + ((hexagonSide / 2) + hexagonSide / 2))};
      graphics.drawPolygon(xValues3, yValues3, 6);
      recurse(graphics, (startY) + height / 2, startX + (hexagonSide / 2), hexagonSide / 2, hexagonHeight);

    }
  }
  // Don't touch the code below
  static int WIDTH = 800;
  static int HEIGHT = 800;

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