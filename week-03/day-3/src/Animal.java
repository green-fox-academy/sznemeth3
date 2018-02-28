public class Animal {
  private String name;
  int hunger = 50;
  int thirst = 50;

  public void eat () {
    hunger--;
  }
  public void drink () {
    thirst--;
  }
  public void play () {
    hunger++;
    thirst++;
  }

  public Animal() {
    name = "random animal";
  }

  public Animal(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Animal{" +
            "name='" + name + '\'' +
            ", hunger=" + hunger +
            ", thirst=" + thirst +
            '}';
  }

  public static void main(String[] args) {
    Animal zebra = new Animal();
    zebra.name = "zebra";
    zebra.eat();
    zebra.drink();
    zebra.play();
    zebra.play();
    System.out.println(zebra.toString());
  }
}
