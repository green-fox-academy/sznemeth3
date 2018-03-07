package music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    name = "Bass Guitar";
    setNumberOfStrings(4);
  }

  public BassGuitar(int i) {
    setNumberOfStrings(i);
    name = "Bass Guitar";
  }
  public String sound() {
    String sound = "Duum-duum-duum";
    return sound;
  }
}
