package fleetofthings;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  @Override
  public int compareTo(Thing o) {
    if (this.completed && !o.completed) {
      return 1;
    } else if (!this.completed && o.completed) {
      return -1;
    } else {
      for (int i = 0; i < this.name.length(); i++) {
        Integer c = (int) this.name.charAt(i);
        Integer d = (int) o.name.charAt(i);
        if (c < d) {
          return -1;
        } else if (c > d) {
          return 1;
        }
      }
      return 0;
    }
  }

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}
