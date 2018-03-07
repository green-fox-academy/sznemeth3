package dominoesexercise;

public class Domino implements Comparable{
  private final int[] values;

  public Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public int compareTo(Object o) {
    Domino d = (Domino) o;
    if (this.getValues()[0] > d.getValues()[0]) {
      return 1;
    } else if (this.getValues()[0] < d.getValues()[0]) {
      return -1;
    } else {
      return 0;
    }
  }

  /*public boolean compareTo(Domino domino) {
    return (this.getValues()[1] == domino.getValues()[0]);
  }*/

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
}
