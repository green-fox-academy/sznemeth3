package garden;

import java.util.ArrayList;

public class Garden {
  ArrayList<Plant> plants;

  public void waterPlants(int wateringAmount) {
    int amountOfThirsty = 0;
    for (Plant plant : plants) {
      if (plant.isThirsty()) {
        amountOfThirsty++;
      }
    }
    for (Plant plant : plants) {
      if (plant.isThirsty()) {
        plant.watering(wateringAmount / amountOfThirsty);
      }
    }
  }

  public void info() {
    for (Plant plant : plants) {
      System.out.println("Name of the plant " + plant.getName()
              + " Amount of water: " + plant.getWaterAmount()
              + " Is the plant thirsty: " + plant.isThirsty());
    }
  }

  public Garden() {
    plants = new ArrayList<>();
  }

  public Garden(ArrayList<Plant> plants) {
    this.plants = plants;
  }

  public static void main(String[] args) {
    ArrayList<Plant> plantList = new ArrayList<>();
    plantList.add(new Flower("yellow Flower", 0.0));
    plantList.add(new Flower("blue Flower", 0.0));
    plantList.add(new Tree("purple Tree", 0.0));
    plantList.add(new Tree("orange Tree", 0.0));
    Garden eden = new Garden(plantList);
    eden.info();

    eden.waterPlants(40);
    eden.info();
    eden.waterPlants(70);
    eden.info();
  }
}
