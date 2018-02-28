package pirates;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Random;

public class Pirate {
  String name;
  int drunkness = 0;
  boolean isAwake = true;
  boolean isAlive = true;
  boolean hasParrrot = false;
  boolean isCapTain = false;

  public Pirate(String name) {
    this.name = name;
  }

  public Pirate(int number) {
    name = String.valueOf(number);
  }

  public void drinkSomeRum() {
    if (isAlive == true) {
      drunkness++;
    } else {
      System.out.println("he's dead");
    }
  }

  public String howsItGoingMate() {
    if (isAlive == true) {
      if (drunkness < 5) {
        return "Pour me anudder!";
      } else {
        isAwake = false;
        return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
      }
    } else {
      return "he's dead";
    }
  }

  public void die() {
    isAlive = false;
  }
  public void brawl(Pirate pirate1, Pirate pirate2) {
    if (pirate1.isAlive == true && pirate2.isAlive == true) {
      if (pirate1 == pirate2) {
        System.out.println("I win't fight myself");
      } else {
        Random r = new Random();
        int outCome = r.nextInt(3) + 1;
        if ( outCome < 2) {
          pirate1.isAlive = false;
        } else if (outCome == 2) {
          pirate2.isAlive = false;
        } else {
          pirate1.isAwake = false;
          pirate2.isAwake = false;
        }
      }
    } else {
      System.out.println("One of the pirates is dead");
    }
  }
  public void addParrot() {
    hasParrrot = true;
  }

}
