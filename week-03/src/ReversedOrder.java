import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    Path filePath = Paths.get("reversed-order.txt");
    reverse(filePath);
  }

  private static void reverse(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      for(int i = lines.size(); i > 0; i--) {
        String decodedLines = "";
        char[] chars = lines.get(i - 1).toCharArray();
        for (int j = 0; j < chars.length; j++) {
          decodedLines = decodedLines + chars[j];
        }
        System.out.println(decodedLines);
      }
    }
    catch (IOException e) {
      System.out.println("error in reading file");
    }
  }
}