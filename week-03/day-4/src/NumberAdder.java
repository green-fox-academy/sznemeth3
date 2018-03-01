public class NumberAdder {
  public static int adder(int n) {
    if ( n == 0) {
      return 0;
    } else {
      return n + adder(n - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(adder(5));
  }
}
