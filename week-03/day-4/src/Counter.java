public class Counter {
  public static void down (int n) {
    if ( n == 0) {
      System.out.println(n);
    } else {
      System.out.println(n);
      down(n-1);
    }
  }

  public static void main(String[] args) {
    down(5);
  }
}
