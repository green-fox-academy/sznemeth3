package animals;

public class Reptile extends Animal {
  public Reptile(String name) {
    setName(name);
  }

  @Override
  public String breed() {
    return "laying eggs";
  }

  @Override
  void poop() {

  }

  @Override
  void eat() {

  }
}
