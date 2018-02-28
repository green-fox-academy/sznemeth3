package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  List<Pirate> crew= new ArrayList<>();

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

  @Override
  public String toString() {
    return "Ship{" +
            "crew=" + crew +
            '}';
  }
  public boolean battle(Ship otherShip) {
    
  }

  public static void main(String[] args) {
    Ship titanic = new Ship();
    titanic.fillShip();
    for (int i = 0; i < titanic.crew.size(); i++) {
      if (titanic.crew.get(i).isCapTain == true) {
        System.out.println(titanic.crew.get(i).name
                + ", drunkness: " + titanic.crew.get(i).drunkness
                + ", Is he alive: " + titanic.crew.get(i).isAlive
                + ", Is he awake: " + titanic.crew.get(i).isAwake);
      }
    }
    System.out.print(" Crew size: " +  titanic.crew.size());
  }
}
