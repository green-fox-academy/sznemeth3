package dominoesexercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    List<Domino> tempList = new ArrayList<>();
    tempList.add(dominoes.get(0));
    for (int j = 0; j < dominoes.size(); j++) {
      for (int i = 1; i < dominoes.size(); i++) {
        /*String part1 = dominoes.get(i).toString().substring(1,2);
        String part2 = tempList.get(j).toString().substring(4,5);
        if (part1.equals(part2))
          tempList.add(dominoes.get(i));
      }*/

        if (dominoes.get(i).getValues()[0] == tempList.get(j).getValues()[1]) {
                tempList.add(dominoes.get(i));
        }
      }
    }
    System.out.println(dominoes.get(0).getValues()[1]);

    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(tempList);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}