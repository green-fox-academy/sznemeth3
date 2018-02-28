import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CopyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful
    String fileName1 = "LOL.txt";
    String fileName2 = "KEK.txt";
    Path path1 = Paths.get(fileName1);
    Path path2 = Paths.get(fileName2);
    File file1 = new File(fileName1);
    File file2 = new File(fileName2);
    Boolean isSuccesful;
    try {
      if (!file1.exists()) {
        file1.createNewFile();
      }
      if (!file2.exists()) {
        isSuccesful = true;
        Files.copy(path1, path2);
        System.out.println(isSuccesful);
      }
      isSuccesful = false;
      System.out.println(isSuccesful);
    } catch (IOException e) {
      e.printStackTrace();
      isSuccesful = false;
      System.out.println(isSuccesful);
    }
  }
}
