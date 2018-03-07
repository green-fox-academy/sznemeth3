package music;

abstract class StringedInstrument extends Instrument {
  private Integer numberOfStrings;

  public Integer getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(Integer numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public StringedInstrument() {
  }

  abstract String sound();

  public void play() {
    System.out.println(name + ", a " + numberOfStrings + "-Stringed instrument that goes: " + sound());
  }

}



