public class String2 {
  public static String xToY(String word, int n) {
    if (n == word.length()) {
      return word;
    } else if (word.substring(n, n + 1).equals("x")) {
      String newWord = word.substring(0, n) + word.substring(n + 1);
      return xToY(newWord, n);
    } else {
      return xToY(word, n + 1);
    }
  }

  public static void main(String[] args) {
    System.out.println(xToY("xxzxxxx", 0));
  }
}