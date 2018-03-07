package garden;

import java.security.PublicKey;

public class Plant {
  private String name;
  private Double waterAmount;

  public boolean isThirsty() {
    return (waterAmount < 15);
  }

  public void watering(int wateringAmount) {
    setWaterAmount(getWaterAmount() + wateringAmount);
  }

  public Plant(String name, Double water) {
    this.name = name;
    this.waterAmount = water;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getWaterAmount() {
    return waterAmount;
  }

  public void setWaterAmount(Double waterAmount) {
    this.waterAmount = waterAmount;
  }

  public Plant() {
    name = "General plant";
    waterAmount = 0.0;
  }
}
