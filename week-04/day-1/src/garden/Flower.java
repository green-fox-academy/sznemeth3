package garden;

public class Flower extends Plant {
  double THIRSTY_INDICATOR = 5.0;
  double ABSORBING_POWER = 0.75;

  public Flower(String name, Double water) {
    super(name, water);

  }

  public boolean isThirsty() {
    return  (getWaterAmount() < THIRSTY_INDICATOR);
  }

  public void watering(int wateringAmount) {
    if (isThirsty()) {
      setWaterAmount(getWaterAmount() + wateringAmount * ABSORBING_POWER);
    }
  }
}
