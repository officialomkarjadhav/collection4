import java.util.Comparator;
import java.util.TreeMap;

public class task4 {
    public static void main(String[] args) {
        TreeMap<String,String> t=new TreeMap<>();
        t.put("c1", "Red");
        t.put("c4", "Blue");
        t.put("c2", "Green");
        t.put("c3", "Yellow");
         System.out.println(t);
         
        class sortkey implements Comparator<String> {

            @Override
            public int compare(String o1, String o2) {
               
                return o1.compareTo(o2);

            }
            

        }
    }
}
