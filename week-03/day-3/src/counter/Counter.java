package counter;

public class Counter {
  int value = 0;
  int counter = value;

  public Counter(int value) {
    this.value = value;
    this.counter = value;
  }

  public Counter() {
  }
  public void add (int add) {
    this.counter = value+add;
  }
  public void add () {
    this.counter++;
  }
  public int get() {
    return counter ;
  }
  public void reset() {
    this.counter = value;
  }
}
