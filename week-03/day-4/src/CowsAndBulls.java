import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {
  private String randomNumber;
  private String state;


  public CowsAndBulls() {
    state = "playing";
    Random r = new Random();
    randomNumber = "";

    while (randomNumber.length() < 4) {
      String oneNumber = String.valueOf(r.nextInt(10));
        randomNumber += String.valueOf(oneNumber);
    }
    System.out.println(randomNumber);

  }

  public String guessTheNumber(String userInput) {
    String result = "";
    for (int i = 0; i < userInput.length(); i++) {
      if (userInput.charAt(i) == randomNumber.charAt(i)) {
        result += " cow ";
      } else if (randomNumber.contains(userInput.substring(i, i + 1))) {
        result += " bull ";
      } else {
        result += " not found ";
      }
    }
    if (!result.contains("bull") && !result.contains("not")) {
      System.out.println("You win");
      state = "finished";
    }
    System.out.println(result + "please guess again");
    return result;
  }
  public static void main(String[] args) {
    System.out.println("Please start the game with guessing a number");
    Scanner scanner = new Scanner(System.in);
    String userInput;
    CowsAndBulls c = new CowsAndBulls();
    while (c.state == "playing") {
      userInput = scanner.nextLine();
      c.guessTheNumber(userInput);
    }
  }
}
