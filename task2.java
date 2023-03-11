import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
        TreeMap<String,String> t=new TreeMap<>();
        t.put("c1", "Red");
        t.put("c2", "Blue");
        t.put("c3", "Green");
        t.put("c4", "Yellow");

        if(t.containsValue("Green")){
            System.out.println("This tree map contain Green");
        }
        else{
            System.out.println("This tree map doesnot contain Green");
        }
        if(t.containsValue("pink")){
            System.out.println("This tree map contain pink");
        }
        else{
            System.out.println("This tree map doesnot contain pink");
        }
    }
}
