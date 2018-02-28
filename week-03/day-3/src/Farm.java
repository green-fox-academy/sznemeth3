import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> animalList = new ArrayList<>();
  int slots;

  public void add(Animal animal) {
    animalList.add(animal);
  }

  public Farm(int slots) {
    this.slots = slots;
  }

  public void breed() {
    Animal ani = new Animal();
    if (animalList.size() < slots) {
      animalList.add(ani);
    }
  }

  public void slaughter() {
    Animal currentHungriest = animalList.get(0);
    for (int i = 0; i < animalList.size(); i++) {
      if (animalList.get(i).hunger < currentHungriest.hunger)
        currentHungriest = animalList.get(i);
    }
    animalList.remove(currentHungriest);
  }

  @Override
  public String toString() {
    return "Farm{" +
            "animalList=" + animalList +
            ", slots=" + slots +
            '}';
  }

  public static void main(String[] args) {
    Animal animal1 = new Animal("zebra");
    Animal animal2 = new Animal("dog");
    Animal animal3 = new Animal("cat");
    Animal animal4 = new Animal("cow");
    Farm farm = new Farm(8);
    farm.add(animal1);
    farm.add(animal2);
    farm.add(animal3);
    farm.add(animal4);
    for (int i = 0; i < 2; i++) {
      animal4.play();
    }
    System.out.println(farm.toString());
    farm.breed();
    System.out.println(farm.toString());
    farm.slaughter();
    System.out.println(farm.toString());
  }
}
