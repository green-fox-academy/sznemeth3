package pirates;

public class WarApp {
  public static void main(String[] args) {
    Armada armada1 = new Armada();
    Armada armada2 = new Armada();
    armada1.fillArmada();
    armada2.fillArmada();
    armada1.armdaStats();
    if (armada1.War(armada2)){
      System.out.println("The first armada won");
    }
    else {
      System.out.println("The second armada won");
    }
  }
}
