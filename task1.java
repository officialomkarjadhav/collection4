import java.util.TreeMap;

class task1{
    public static void main(String[] args) {
        TreeMap <String,String> t=new TreeMap<>();
        t.put("c1", "Red");
        t.put("c2", "Blue");
        t.put("c3", "Green");
        t.put("c4", "Yellow");
        System.out.println(t);
        if(t.containsKey("c1")){
            System.out.println("The tree map contain key c1");
        }
        else{
            System.out.println("The tree map does not contain key c1");
        }
        if(t.containsKey("c4")){
            System.out.println("The tree map contain key c4");
        }
        else{
            System.out.println("The tree map does not contain key c4");
        }
        
    }
}