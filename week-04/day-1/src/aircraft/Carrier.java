package aircraft;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

import java.util.ArrayList;

public class Carrier {
  private ArrayList<Aircraft> aircrafts;
  private Integer storedAmmo;
  private String name;
  private Integer health;

  public Carrier() {

  }

  public Carrier(ArrayList<Aircraft> aircrafts, Integer storedAmmo, String name, Integer health) {
    this.aircrafts = aircrafts;
    this.storedAmmo = storedAmmo;
    this.name = name;
    this.health = health;
  }

  public void addAircraft(String type) {
    if (type.equals("F16")) {
      F16 f16 = new F16();
      aircrafts.add(f16);
    } else if (type.equals("F35")) {
      F35 f35 = new F35();
      aircrafts.add(f35);
    }
  }

  public void fill() {
    int neededAmmoToFillAll = 0;
    if (storedAmmo == 0) {
      System.out.println("No ammo to refill");
    } else {
      for (Aircraft aircraft : aircrafts) {
        neededAmmoToFillAll += aircraft.getMaxAmmo() - aircraft.getCurrentAmmo();
      }
      if (neededAmmoToFillAll > storedAmmo) {
        for (Aircraft aircraft : aircrafts) {
          if (aircraft.getType().equals("F35")) {
            storedAmmo = aircraft.refill(storedAmmo);
          }
        }
        if (storedAmmo > 0) {
          for (Aircraft aircraft : aircrafts) {
            if (aircraft.getType().equals("F16")) {
              storedAmmo = aircraft.refill(storedAmmo);
            }
          }
        }
      } else {
        for (Aircraft aircraft : aircrafts) {
          if (aircraft.getMaxAmmo() < storedAmmo) {
            storedAmmo = aircraft.refill(storedAmmo);
          }
        }
      }
    }
  }

  public void fight(Carrier otherCarrier) {
    for (Aircraft aircraft : aircrafts) {
      otherCarrier.health -= aircraft.getCurrentAmmo() * aircraft.getBaseDamage();
      if (otherCarrier.health < 1) {
        System.out.println("It's dead Jim :(");
      }
    }
  }
}
