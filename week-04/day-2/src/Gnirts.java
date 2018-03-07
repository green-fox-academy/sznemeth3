import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
  String field;


  public Gnirts(String feild) {
    this.field = feild;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String c = "";
    for (int i = start; i < end; i++) {
      c += field.toCharArray()[field.toCharArray().length - i -1];

    }
    return c;
  }

  @Override
  public int length() {
    return field.toCharArray().length;
  }

  @Override

  public char charAt(int index) {
    return field.toCharArray() [field.toCharArray().length - index -1];
  }

  public static void main(String[] args) {
    String test = "testing this shiet";
    Gnirts gnirt = new Gnirts(test);
    System.out.println(gnirt.length());
  }
}
