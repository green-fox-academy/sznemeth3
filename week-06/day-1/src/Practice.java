import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
  public static void main(String[] args) {
    //Exercise 1*******************************************************************************************************
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    numbers.stream().filter(x ->  x % 2 == 0 ).forEach(System.out::println);

    for (int number:numbers) {
      if (number % 2 == 0) {
        System.out.println(number);
      }
    }
    //Exercise 2*******************************************************************************************************
    List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    IntSummaryStatistics stats = numbers2.stream().filter(x ->  x % 2 == 1 || x % 2 == -1).mapToInt((x) -> x).summaryStatistics();
    System.out.println("Average of all numbers : " + stats.getAverage());

    List<Integer> averageCalculator = new ArrayList<>();
    Double average = 0.;
    for (Integer number: numbers2) {
      if (number % 2 == -1 || number % 2 == 1) {
        averageCalculator.add(number);
        average = average + number;
      }
    }
    System.out.println(average/averageCalculator.size());
    //Exercise 3*******************************************************************************************************
    ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    numbers3.stream().filter(x ->  x > 0 ).map(x -> x * x).forEach(System.out::println);

    for (Integer number:numbers3) {
      if (number > 0) {
        System.out.println(number * number);
      }
    }
    //Exercise 4*******************************************************************************************************
    ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));
    numbers4.stream().map(x -> x * x).filter(x ->  x > 20 ).forEach(System.out::println);

    for (Integer number:numbers4) {
      if (number * number > 20) {
        System.out.println(number * number);
      }
    }
    //Exercise 5*******************************************************************************************************
    String word = "dsadjsadnsadDJsdMLKDSdsakldDSKADlsdkmsadmDsdsaWWEQ";
    word.chars().mapToObj(x -> (char) x).filter(x -> Character.isUpperCase(x)).forEach(System.out::print);
    System.out.println();
    for (Character c : word.toCharArray()) {
      if (Character.isUpperCase(c)) {
        System.out.print(c);
      }
    }
    //Exercise 6*******************************************************************************************************
    System.out.println();
    ArrayList<String> cities = new ArrayList<>(Arrays
            .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));
    cities.stream().filter(s -> s.startsWith("A") && s.endsWith("I")).forEach(System.out::println);
    for (String city: cities) {
      if (city.startsWith("A") && city.endsWith("I")) {
        System.out.println(city);
      }
    }
    //Exercise 7*******************************************************************************************************
    String word2 = "AAAaaab";
    HashMap<Character,Integer> map = new HashMap<Character,Integer>();
    word2.chars().mapToObj(x -> (char) x).forEach(x -> map.put(x, map.getOrDefault(x, 0) + 1)) ;

    System.out.println(map);
    HashMap<Character,Integer> mapBasic = new HashMap<Character,Integer>();
    for (Character c: word2.toCharArray()) {
      mapBasic.put(c, mapBasic.getOrDefault(c, 0) + 1);
    }
    System.out.println(mapBasic);
    //Exercise 8*******************************************************************************************************
    HashMap<Integer,Integer> mapNumbers = new HashMap<Integer, Integer>();
    ArrayList<Integer> numbers8 = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));
    numbers8.stream().forEach(x -> mapNumbers.put(x, mapNumbers.getOrDefault(x, 0) + 1));
    System.out.println(mapNumbers);

    System.out.println(numbers8.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    Stream.of(numbers8.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))).forEach(System.out::println);

    HashMap<Integer,Integer> mapNumbers2 = new HashMap<Integer, Integer>();
    for (Integer c: numbers8) {
      mapNumbers2.put(c, mapNumbers2.getOrDefault(c, 0) + 1);
    }
    System.out.println(mapNumbers2);
    //Exercise 9*******************************************************************************************************
    Character[] list = new Character[]{'K','u','t','y','a'};
    String newWord = Arrays.stream(list).map(x -> String.valueOf(x)).collect(Collectors.joining(""));
    System.out.println(newWord);

    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i]);
    }
  }
}
