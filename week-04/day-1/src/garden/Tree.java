package garden;

public class Tree extends Plant {
  double THIRSTY_INDICATOR = 10.0;
  double ABSORBING_POWER = 0.4;

  public Tree(String name, Double water) {
    super(name, water);

  }

  public boolean isThirsty() {
    return (getWaterAmount() < THIRSTY_INDICATOR);
  }

  public void watering(int wateringAmount) {
    if (isThirsty()) {
      setWaterAmount(getWaterAmount() + wateringAmount * ABSORBING_POWER);
    }
  }
}
