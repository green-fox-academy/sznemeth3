package music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    name = "Electronic Guitar";
    setNumberOfStrings(6);
  }

  public ElectricGuitar(int i) {
    setNumberOfStrings(i);
    name = "Electronic Guitar";
  }
  public String sound() {
    String sound = "Twang";
    return sound;
  }
}
