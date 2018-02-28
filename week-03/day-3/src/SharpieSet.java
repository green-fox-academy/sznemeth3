import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> set;

  public SharpieSet() {
    this.set = new ArrayList<>();
  }

  public void add(Sharpie sharpie) {
    set.add(sharpie);
  }

  public int countUsable() {
    int counter = 0;
    for (int i = 0; i < set.size(); i++) {
      if (set.get(i).inkAmount > 0) {
        counter++;
      }
    }
    return counter;
  }
  public void removeTrash() {
    for (int i = 0; i < set.size(); i++) {
      if (set.get(i).inkAmount == 0) {
        set.remove(i);
      }
    }
  }

  @Override
  public String toString() {
    return "SharpieSet{" +
            "set=" + set +
            '}';
  }

  public static void main(String[] args) {
    Sharpie sharpie = new Sharpie("red",1f,1f);
    Sharpie sharpie2 = new Sharpie("red",2f,0f);
    Sharpie sharpie3 = new Sharpie("red",3f,2f);
    Sharpie sharpie4 = new Sharpie("red",3f,0f);
    Sharpie sharpie5 = new Sharpie("red",4f,1f);
    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.add(sharpie);
    sharpieSet.add(sharpie2);
    sharpieSet.add(sharpie3);
    sharpieSet.add(sharpie4);
    sharpieSet.add(sharpie5);
    System.out.println(sharpieSet.countUsable());
    sharpieSet.removeTrash();
    System.out.println(sharpieSet.toString());
  }
}
