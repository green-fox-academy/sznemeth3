import java.util.Random;
import java.util.Scanner;

public class CowsAndBulls {
  private String randomNumber;
  private String state;

  public String getRandomNumber() {
    return randomNumber;
  }

  public String getState() {
    return state;
  }

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
  public String guessTheNumberG(String userInput) {
    String result = "";
    for (int i = 0; i < userInput.length(); i++) {
      if (userInput.charAt(i) == randomNumber.charAt(i)) {
        result += "cow ";
      } else if (randomNumber.contains(userInput.substring(i, i + 1))) { {
        result += "bull ";
      }
      } else {
        result += "";
      }
    }
    if (result.equals("cow cow cow cow ")) {
      System.out.println("You win");
      state = "finished";
    }
    else System.out.println(result + "please guess again");
    return result;
  }

  public String guessTheNumber(String userInput) {
    String result = "";
    String notCowsRandom = randomNumber;
    String notCowsGuess = "";
    for (int i = 0; i < userInput.length(); i++) {
      if (userInput.charAt(i) != randomNumber.charAt(i)) {
        notCowsGuess += String.valueOf(userInput.charAt(i));
        notCowsRandom += String.valueOf(randomNumber.charAt(i));
      } else {
        result += "cow ";
      }
    }
    for (int i = 0; i < notCowsGuess.length(); i++) {
      if (notCowsRandom.contains(notCowsGuess.substring(i, i + 1))) {
        result += "bull ";
      }
    }
    if (result.equals("cow cow cow cow ")) {
      System.out.println("You win");
      state = "finished";
    } else System.out.println(result + "please guess again");
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


