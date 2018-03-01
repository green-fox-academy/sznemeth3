public class Bunny2 {
  public static int ears2(int n) {
    if (n == 0) {
      return 0;
    } else if (n % 2 == 1) {
      return 2 + ears2(n - 1);
    } else {
      return 3 + ears2(n - 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(ears2(5));
  }
}
