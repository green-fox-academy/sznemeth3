import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  public HashMap convertToDictionary (String word) {
    HashMap<Character,Integer> dictionary = new HashMap<Character, Integer>();
    for (Character c:word.toCharArray()) {
      if(dictionary.containsKey(c))
      {
        dictionary.put(c, dictionary.get(c)+1);
      }
      else
      {
        dictionary.put(c, 1);
      }
    }
    return dictionary;
  }
}
