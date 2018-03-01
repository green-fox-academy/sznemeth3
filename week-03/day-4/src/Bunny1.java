public class Bunny1 {
  public static int ears (int n) {
    if ( n ==0) {
      return 0;
    } else {
      return 2 + ears(n-1);
    }
  }

  public static void main(String[] args) {
    System.out.println(ears(5));
  }
}
