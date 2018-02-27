import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
    Path filePath = Paths.get("encoded-lines.txt");
    reverse(filePath);
  }
  private static void reverse(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        String decodedLines = "";
        char[] chars = line.toCharArray();
        for (int k = 0; k < chars.length; k ++) {
          int ascii = chars[k];
          ascii --;
          chars[k] = (char) ascii;
          decodedLines = decodedLines + chars[k];
        }
        System.out.println(decodedLines);
      }
    }
    catch (IOException e) {
      System.out.println("error in reading file");
    }
  }
}