package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> crew = new ArrayList<>();

  public void fillShip() {
    Random r = new Random();
    int crewSize = r.nextInt(50) + 1;
    Pirate pirate = new Pirate("captain");
    pirate.isCapTain = true;
    crew.add(pirate);
    for (int i = 1; i < crewSize; i++) {
      Pirate pirate1 = new Pirate(i);
      crew.add(pirate1);
    }
  }

  public Ship() {
  }

  @Override
  public String toString() {
    return "Ship{" +
            "crew=" + crew +
            '}';
  }

  public boolean battle(Ship otherShip) {
    //Calculate alive crew size :
    int thisShipCrew = 0;
    for (Pirate pirate : this.crew) {
      if (pirate.isAlive == true) {
        thisShipCrew++;
      }
    }
    int otherShipCrew = 0;
    for (Pirate pirate : otherShip.crew) {
      if (pirate.isAlive == true) {
        otherShipCrew++;
      }
    }
    //calculate ship scores :
    int thisShipScore = thisShipCrew - this.crew.get(0).drunkness;
    int otherShipScore = otherShipCrew - otherShip.crew.get(0).drunkness;
    //If this ship won :
    if (thisShipScore > otherShipScore) {
      thisShipWon(otherShip);
      return true;
    } /* if other ship won */ else if (thisShipScore < otherShipScore) {
      otherShipWon(otherShip);
      return false;
    } else {
      // it's a draw, lets decide with a coin flip
      Random r = new Random();
      if (r.nextInt(2) == 1) {
        thisShipWon(otherShip);
        return true;
      } else {
        otherShipWon(otherShip);
        return false;
      }
    }
  }


  public void otherShipWon(Ship otherShip) {
    Random r = new Random();
    for (Pirate pirate : this.crew) {
      if (r.nextInt(2) == 1) {
        pirate.isAlive = false;
      }
    }
    int receivedRum = r.nextInt(30) * 2;
    for (int i = 0; i < receivedRum; i++) {
      otherShip.crew.get(r.nextInt(otherShip.crew.size())).drinkSomeRum();
    }
  }

  public void thisShipWon(Ship otherShip) {
    Random r = new Random();
    for (Pirate pirate : otherShip.crew) {
      if (r.nextInt(2) == 1) {
        pirate.isAlive = false;
      }
    }
    int receivedRum = r.nextInt(30) * 2;
    for (int i = 0; i < receivedRum; i++) {
      this.crew.get(r.nextInt(this.crew.size())).drinkSomeRum();
    }
  }

  public void shipStats() {
    System.out.println(this.crew.get(0).name
            + ", drunkness: " + this.crew.get(0).drunkness
            + ", Is he alive: " + this.crew.get(0).isAlive
            + ", Is he awake: " + this.crew.get(0).isAwake);
    int thisShipCrew = 0;
    for (Pirate pirate : this.crew) {
      if (pirate.isAlive == true) {
        thisShipCrew++;
      }
    }
    System.out.println("Alive members of the crew:" + " " + thisShipCrew + ", Overall members of the crew " + this.crew.size());
  }

  public static void main(String[] args) {
    Ship titanic = new Ship();
    titanic.fillShip();
    titanic.shipStats();
  }
}
