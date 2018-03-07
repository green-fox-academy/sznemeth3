package dominoesexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    List<Domino> tempList = new ArrayList<>();
    Collections.sort(dominoes);
    System.out.println(dominoes);
    tempList.add(dominoes.get(0));
    int position;
    for (int j = 1; j < dominoes.size(); j++) {
      position = 0;
      for (int i = 0; i < tempList.size(); i++) {
        position += dominoes.get(j).compareTo(tempList.get(i));
      }
      tempList.add(position, dominoes.get(j));
    }
    System.out.println(dominoes.get(0).getValues()[1]);

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