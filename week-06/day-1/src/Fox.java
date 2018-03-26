import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fox {
  String name;
  String color;
  String type;

  public Fox(String name, String color, String type) {
    this.name = name;
    this.color = color;
    this.type = type;
  }

  public static void main(String[] args) {
    ArrayList<Fox> foxList = new ArrayList<>();
    foxList.add(new Fox("Becool", "green", "Macrotis"));
    foxList.add(new Fox("Vuk", "red", "Corsac"));
    foxList.add(new Fox("Karak", "green", "Pallida"));
    foxList.add(new Fox("Firefox", "blue", "Macrotis"));
    foxList.add(new Fox("Yak", "pink", "Macrotis"));
    foxList.stream().filter(f -> f.color.contains("green") && f.type.contains("Pallida")).map(f -> f.name).forEach(System.out::println);

  }
}
