import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Log {
  public static void main(String[] args) {
    Path filePath = Paths.get("log.txt");
    uniqueIP(filePath);
    getPostRatio(filePath);
  }

  private static void getPostRatio(Path filePath) {

    try {
      List<String> lines = Files.readAllLines(filePath);
      int getCounter = 0;
      int postCounter = 0;

      for (String line: lines) {
        String[] parts = line.split("   ");
        if (parts[2].contains("GET")) {
          getCounter++;
        } else {
          postCounter++;
        }
      }
      double result = (double) getCounter / (double)postCounter;
      System.out.println(result);
    }
    catch (IOException e) {
      System.out.println("error in reading file");
    }
  }

  private static void uniqueIP(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line: lines) {
        String[] parts = line.split("   ");
        System.out.println(parts[1]);
      }
    }
    catch (IOException e) {
      System.out.println("error in reading file");
    }
  }
}
