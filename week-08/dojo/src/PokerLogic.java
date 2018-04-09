import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PokerLogic {


  public String getResult(List<String> black, List<String> white) {
    orderCards(black);
    orderCards(white);
    if (checkIfFlush(white) ) {
      return "White wins! - (Flush: " + white.get(4).charAt(0) + ")";
    } else {
      return getHigher(black, white);
    }
  }

  public List<String> orderCards(List<String> cards) {
    cards.sort(Comparator.comparing(o -> decoder(o.charAt(0))));
    return cards;
  }

  public String getHigher(List<String> black, List<String> white) {
    for (int i = black.size(); i > 0; i--) {
      if (compareTwoCards(black.get(i - 1), white.get(i - 1)) == 0) {
        continue;
      } else if (compareTwoCards(black.get(i - 1), white.get(i - 1)) == 1) {
        return "Black wins! - (High card: " + black.get(i - 1).charAt(0) + ")";
      } else {
        return "White wins! - (High card: " + white.get(i - 1).charAt(0) + ")";
      }
    }
    return "Tie";
  }

  public Integer compareTwoCards(String blackPlayerCard, String whitePlayerCard) {
    if (decoder(blackPlayerCard.charAt(0)) > decoder(whitePlayerCard.charAt(0))) {
      return 1;
    } else if (decoder(blackPlayerCard.charAt(0)) < decoder(whitePlayerCard.charAt(0))) {
      return 2;
    } else {
      return 0;
    }
  }

  public Integer decoder(Character character) {
    if (character.equals('A')) {
      return 14;
    } else if (character.equals('K')) {
      return 13;
    } else if (character.equals('Q')) {
      return 12;
    } else if (character.equals('J')) {
      return 11;
    } else if (character.equals('T')) {
      return 10;
    } else {
      return Integer.parseInt(character.toString());
    }
  }

  public boolean checkIfFlush(List<String> hand) {
    for (int i = 0; i < hand.size()-2; i++) {
      if (hand.get(i).charAt(1) == hand.get(i +1).charAt(1)) {
        continue;
      } else {
        return false;
      }
    }
    return true;
  }
}
