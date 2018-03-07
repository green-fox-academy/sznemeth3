package fleetofthings;

import java.util.Collections;

public class FleetOfThings {


  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing thing = new Thing("aet milk");
    Thing thing1 = new Thing("Remove the obstacles");
    Thing thing2 = new Thing("Stand up");
    Thing thing3 = new Thing("aet lunch");

    fleet.add(thing);
    fleet.add(thing1);
    fleet.add(thing2);
    fleet.add(thing3);

    thing.complete();
    thing3.complete();
    Collections.sort(fleet.things);

    System.out.println(fleet);
  }
}