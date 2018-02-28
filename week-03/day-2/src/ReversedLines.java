import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
// Create a method that decrypts the duplicated-chars.txt
    Path filePath = Paths.get("reversed-lines.txt");
    reverse(filePath);


  }

  private static void reverse(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        String decodedLines = "";
        char[] chars = line.toCharArray();
        for (int k = chars.length; k > 0; k --) {
            decodedLines = decodedLines + chars[k-1];
        }
        System.out.println(decodedLines);
      }
    }
    catch (IOException e) {
      System.out.println("error in reading file");
    }
  }
}