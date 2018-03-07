package animals;

public class Mammal extends Animal {
  public Mammal(String name) {
    setName(name);
  }

  @Override
  public String breed() {
    return "pushing miniature versions out";
  }

  @Override
  void poop() {

  }

  @Override
  void eat() {

  }
}
