import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.
    String fileName1 = "Tic-Tac";
    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }
  private static String ticTacResult(String fileName) {
    Path filePath = Paths.get(fileName);
    try {

      String checkDiagonal1 = "";
      String checkDiagonal2 = "";
      String checkColumn1 = "";
      String checkColumn2 = "";
      String checkColumn3 = "";
      List<String> list = Files.readAllLines(filePath);
      for (int i = 0; i < list.size(); i++) {

        if (list.get(i).equals("xxx")) {
          return ("x");
        } else if (list.get(i).equals("ooo")) {
          return ("o");
        }
        checkDiagonal1 = checkDiagonal1 + list.get(i).charAt(i);
        checkDiagonal2 = checkDiagonal2 + list.get(i).charAt(list.size()-1-i);
        checkColumn1 = checkColumn1 + list.get(i).charAt(0);
        checkColumn2 = checkColumn2 + list.get(i).charAt(1);
        checkColumn3 = checkColumn3 + list.get(i).charAt(2);
      }
      if (checkDiagonal1.equals("xxx") || checkDiagonal2.equals("xxx") || checkColumn1.equals("xxx") || checkColumn2.equals("xxx") || checkColumn3.equals("xxx")) {
        return "x";
      }
      else if (checkDiagonal1.equals("ooo") || checkDiagonal2.equals("ooo") || checkColumn1.equals("ooo") || checkColumn2.equals("ooo") || checkColumn3.equals("ooo")) {
        return "o";
      } else {
        return "draw";
      }
    } catch (IOException e) {
      System.out.println("can't read file");
      return "fail";
    }
  }
}