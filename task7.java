import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class task7 {
    private static final String S = null;

    public static void main(String[] args) {
       
            HashMap<String, String> hashmap = new HashMap<String, String>();
            hashmap.put("Key1", "Value1");
            hashmap.put("Key2", "Value2");
            System.out.println("Iterating or looping map using entrySet and foreach loop");
          
            Set<Map.Entry<String, String>> entrySet = hashmap.entrySet();
            for (Map.Entry entry : entrySet) {
                System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
            
    }
}
}