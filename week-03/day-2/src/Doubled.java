import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    Path filePath = Paths.get("duplicated-chars.txt");
    duplicated(filePath);

  }

  private static void duplicated(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        String decodedLines = "";
          char[] chars = line.toCharArray();
          for (int j = 0; j < chars.length; j++) {
            if (j % 2 < 1) {
              decodedLines = decodedLines + chars[j];
            }
          }
        System.out.println(decodedLines);
        }
    }
    catch (IOException e) {
      System.out.println("error in reading file");
    }
  }
}