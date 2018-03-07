package animals;

import animals.Animal;

public class Bird extends Animal {
  public Bird(String name) {
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
