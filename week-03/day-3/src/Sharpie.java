public class Sharpie {
  String color;
  Float width;
  Float inkAmount = 100.0f;


  public Sharpie(String color, Float width) {
    this.color = color;
    this.width = width;
  }

  public Sharpie(String color, Float width, Float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  public Sharpie() {
    this.color = "no color";
    this.width = 0f;
  }

  public void use() {
    inkAmount--;
  }

  public static void main(String[] args) {
    Sharpie bigRed = new Sharpie("red",10f);
    bigRed.use();
    System.out.println(bigRed.inkAmount);

  }

}
