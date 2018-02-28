import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeWork {
  public static void main(String[] args) {
    ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();
    Map<String, Object> row0 = new HashMap<String, Object>();
    row0.put("type", "bukk");
    row0.put("leaf color", "green");
    row0.put("age", 2);
    row0.put("sex", "tree");
    map.add( row0 );

    Map<String, Object> row1 = new HashMap<String, Object>();
    row1.put("type", "cseresznye");
    row1.put("leaf color", "green");
    row1.put("age", 1);
    row0.put("sex", "tree");
    map.add( row1 );

    Map<String, Object> row2 = new HashMap<String, Object>();
    row2.put("type", "gesztenye");
    row2.put("leaf color", "green");
    row2.put("age", 3);
    row0.put("sex", "tree");
    map.add( row2 );

    Map<String, Object> row3 = new HashMap<String, Object>();
    row3.put("type", "tolgy");
    row3.put("leaf color", "green");
    row3.put("age", 5);
    row0.put("sex", "tree");
    map.add( row3 );

    Map<String, Object> row4 = new HashMap<String, Object>();
    row4.put("type", "fuz");
    row4.put("leaf color", "green");
    row4.put("age", 7);
    row0.put("sex", "tree");
    map.add( row4 );
  }
}
