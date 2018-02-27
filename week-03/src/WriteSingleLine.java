import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"
    String pathString = "my-file.txt";
    File file1 = new File(pathString);
    Path path1 = Paths.get(pathString);
    try {
      if (!file1.exists()) {
        file1.createNewFile();
      }
      List<String> content = Files.readAllLines(path1);
      content.add("Szilard Nemeth");
      Files.write(path1,content, StandardOpenOption.APPEND);
    } catch (IOException e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}