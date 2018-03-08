import java.util.ArrayList;
import java.util.List;

public class Sum {
  List<Integer> parameter = new ArrayList<>();

  public Integer sum(List values) {
    parameter = values;
    Integer summedValue = 0;
    for (Integer number : parameter) {
      summedValue += number;
    }
    return summedValue;
  }
}
