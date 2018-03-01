public class String3 {
  public static String xToY(String word, int n) {
    if (n == word.length()) {
      return word;
    } else if( n == 0) {
      return xToY(word, n + 1);
    } else {
      String newWord = word.substring(0, n) + '*' + word.substring(n);
      return xToY(newWord, n + 2);
    }
  }
  public static void main(String[] args) {
    System.out.println(xToY("xxzxxxx", 0));
  }
}