import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    Path filePath = Paths.get("week-03.iml");

    try {
      List<String> list = Files.readAllLines(filePath);
      System.out.println(list.size());
    }
    catch (IOException e) {
      System.out.println("Can't open file");
    }
  }
}
