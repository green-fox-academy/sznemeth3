public class Animal {
  private String name;
  private int hunger = 50;
  private int thirst = 50;

  private void eat () {
    hunger--;
  }
  private void drink () {
    thirst--;
  }
  private void play () {
    hunger++;
    thirst++;
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
