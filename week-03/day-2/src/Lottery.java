import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv
    Path filePath = Paths.get("lottery.csv");
    findNumber(filePath);

  }

  private static void findNumber(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      Map<Integer,Integer> count = new HashMap<Integer,Integer>();
      for (int i = 1; i < 91; i++) {
        count.put(i,0);
      }
      for (String line: lines) {
        String[] parts = line.split(";");
        for (int i = 11; i < 15; i++) {
          int current = Integer.parseInt(parts[i]);
          if(count.containsKey(current))
          {
            count.put(current, count.get(current)+1);
          }
          else
          {
            count.put(current, 1);
          }
        }
      }
      List<Integer> list = new ArrayList<>(count.values());
      Collections.sort(list, Collections.reverseOrder());
      List<Integer> top5 = list.subList(0, 5);
      System.out.println(top5);


    }
    catch (IOException e) {
      System.out.println("error in reading file");
    }
  }
}
