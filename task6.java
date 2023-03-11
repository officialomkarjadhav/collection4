import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class task6 {
    public static void main(String[] args) {
        TreeMap<String,String> t=new TreeMap<>();
        t.put("c1", "Red");
        t.put("c2", "Blue");
        t.put("c3", "Green");
        
        System.out.println("Iterating or looping map using keySet Iterator");
       Set<String> s=t.keySet();
       Iterator <String> i=s.iterator();
       while(i.hasNext()){
        String key=i.next();
        System.out.println("Key "+key+" value "+t.get(key));
       }

    }
}
