package pirates;


import javax.swing.*;
        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class BattleApp {
  static int WIDTH = 1500;
  static int HEIGHT = 1500;
  static int SHIP1X = 50;
  static int SHIPY = 300;
  static int SHIP_WIDTH = 300;
  static int SHIP2X = WIDTH - SHIP_WIDTH;
  static int SHIP_ARC_WIDTH = 100;
  static int LINE_LENGTH = 100;
  static int ITERATOR = 0;
  static int END = 424;
  static int LABEL = 50;



  private static void mainDraw(Graphics graphics) {

    /*Ship ship1 = new Ship();
    Ship ship2 = new Ship();
    ship1.fillShip();
    ship2.fillShip();
    ship1.shipStats();
    ship2.shipStats();
    System.out.println(ship1.battle(ship2));
    ship1.shipStats();
    ship2.shipStats();*/
    graphics.setColor(Color.BLUE);
    graphics.fillRect(0,SHIPY,WIDTH,HEIGHT);
    graphics.setColor(new Color(204, 255, 255));
    graphics.fillRect(0,0,WIDTH,SHIPY+30);


    graphics.setColor(new Color(102, 51, 0));
    graphics.fillRoundRect(SHIP1X + ITERATOR,SHIPY,SHIP_WIDTH,SHIP_ARC_WIDTH,SHIP_ARC_WIDTH,SHIP_WIDTH);
    graphics.drawLine(SHIP1X + (SHIP_WIDTH/2) + ITERATOR,SHIPY,SHIP1X + (SHIP_WIDTH/2) + ITERATOR,SHIPY-LINE_LENGTH);
    graphics.fillRect(SHIP1X+(SHIP_WIDTH/3)+ITERATOR,SHIPY-LINE_LENGTH*2,SHIP_WIDTH/3,SHIP_WIDTH/2);
    graphics.drawString("SHIP 1",SHIP1X + SHIP_WIDTH/2 + ITERATOR,70);


    graphics.setColor(new Color(198, 166, 132));
    graphics.fillRoundRect(SHIP2X - ITERATOR,SHIPY,SHIP_WIDTH,SHIP_ARC_WIDTH,SHIP_ARC_WIDTH,SHIP_WIDTH);
    graphics.drawLine(SHIP2X + (SHIP_WIDTH/2) - ITERATOR,SHIPY,SHIP2X + (SHIP_WIDTH/2) - ITERATOR,SHIPY-LINE_LENGTH);
    graphics.fillRect(SHIP2X+(SHIP_WIDTH/3)-ITERATOR,SHIPY-LINE_LENGTH*2,SHIP_WIDTH/3,SHIP_WIDTH/2);
    graphics.drawString("SHIP 2",SHIP2X + SHIP_WIDTH/2 - ITERATOR,70);

    int position = ((SHIP2X - (SHIP1X+SHIP_WIDTH))/2);
    graphics.drawString(Integer.toString(ITERATOR),30,30);
    graphics.drawString(Integer.toString(SHIP2X - (SHIP1X+SHIP_WIDTH)/2),70,30);

    if (ITERATOR  == END) {
      Ship ship1 = new Ship();
      Ship ship2 = new Ship();
      ship1.fillShip();
      ship2.fillShip();
      ship1.shipStats();
      ship2.shipStats();
      if (ship1.battle(ship2) == true) {
        graphics.drawString("Ship 1 won", WIDTH/2, LABEL);
      } else {
        graphics.drawString("Ship 2 won", WIDTH/2, LABEL);
      }
    }
  }
  // Don't touch the code below


  public static void main(String[] args) throws InterruptedException{
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel imagePanel = new ImagePanel();
    jFrame.add(imagePanel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
//SHIP2X+(SHIP_WIDTH/3)-ITERATOR,SHIP1X+(SHIP_WIDTH/3)+ITERATOR(SHIP2X - (SHIP1X+SHIP_WIDTH))/2
    while (ITERATOR < (SHIP2X - (SHIP1X+SHIP_WIDTH))/2) {
      imagePanel.repaint();
      Thread.sleep(10);
      ITERATOR += 1;
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