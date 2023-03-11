import java.util.ArrayList;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        String []city=  {"pune","bengalore","hubli","goa"};
   ArrayList <String> a=new ArrayList<>(Arrays.asList(city));
   a.add("punjab");
   a.add("vijayapur");

   for(String e:a){
    System.out.println(e);
   }
    }
}
