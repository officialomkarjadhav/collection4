import java.util.Set;
import java.util.TreeMap;

class task3{
public static void main(String[] args) {
    TreeMap<String,String> t=new TreeMap<>();
    t.put("c1", "Red");
    t.put("c2", "Blue");
    t.put("c3", "Green");
    t.put("c4", "Yellow");
  Set<String> s=t.keySet();
  
  for(String k:s){
    System.out.println(k);
  }

}
}