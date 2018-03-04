package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
  List<Ship> ships = new ArrayList<>();

  public void fillArmada() {
    Random r = new Random();
    int shipAmount = r.nextInt(40) + 1;
    for (int i = 0; i < shipAmount; i++) {
      Ship ship = new Ship();
      this.ships.add(ship);
      ship.fillShip();
    }
  }
  public boolean War (Armada otherArmada) {
    int counterThis = 0;
    int counterOther = 0;
    while (true){
      if (this.ships.get(counterThis).battle(otherArmada.ships.get(counterOther))) {
        counterOther +=1;
        if (counterOther == otherArmada.ships.size()) {
          break;
        }
      } else {
        counterThis+=1;
        if (counterThis == this.ships.size()) {
          break;
        }
      }
    }
    if (counterThis == this.ships.size()) {
      return false;
    }
    else {
      return true;
    }
  }
  public void armdaStats(){
    System.out.println(this.ships.size());
    for (Ship ship: ships) {
      ship.shipStats();
    }
  }
}
