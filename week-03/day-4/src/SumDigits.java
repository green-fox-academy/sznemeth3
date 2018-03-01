public class SumDigits {
  public static int digitAdder(int n) {
    if (n < 0) {
      return 0;
    } else if (n / 10 == 0) {
      return 1;
    }
    else {
      return 1 + digitAdder(n / 10);
    }
  }
  public static void main(String[] args) {
    System.out.println(digitAdder(123432423));
  }
}
