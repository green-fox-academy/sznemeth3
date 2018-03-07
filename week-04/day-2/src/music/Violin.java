package music;

public class Violin extends StringedInstrument {
  public Violin() {
    name = "Violin";
    setNumberOfStrings(4);
  }

  public Violin(int i) {
    setNumberOfStrings(i);
    name = "Violin";
  }
  public String sound() {
    String sound = "Screech";
    return sound;
  }
}
