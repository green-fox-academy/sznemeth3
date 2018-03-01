import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise12 {
  private static void mainDraw(Graphics graphics) {
    recurse(graphics, 0,0,WIDTH / 3,HEIGHT / 3);

  }
  public static void recurse (Graphics graphics,int x, int y, int width, int height){
    if (width < 1) {

    } else {
      graphics.drawRect(x , y, width, height);
      graphics.drawRect(x , y + height, width, height);
      recurse (graphics ,x , y + height, width / 3, height/ 3);
      graphics.drawRect(x , y + (height * 2 ), width, height);
      graphics.drawRect(x + width, y , width, height);
      recurse(graphics,x + width, y , width / 3, height / 3);
      graphics.drawRect(x + width, y + height, width, height);
      graphics.drawRect(x + width, y + (height * 2), width, height);
      recurse(graphics,x + width, y + (height * 2), width/3, height/3);
      graphics.drawRect(x + (width) * 2, y , width, height);
      graphics.drawRect(x + (width) * 2, y + height, width, height);
      recurse(graphics,x + (width) * 2, y + height, width /3, height/3);
      graphics.drawRect(x + (width) * 2, y + (height * 2), width, height);

      //recurse(graphics,  x + width / 3, y + height / 3, width /3, height / 3);
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