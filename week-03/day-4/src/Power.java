public class Power {
  public static int PowerN(int n, int a) {
    if (n < 1) {
      return 1;
    } else if (a == 1) {
      return n;
    } else {
      return n * PowerN(n, a - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(PowerN(5,3));
  }
}
