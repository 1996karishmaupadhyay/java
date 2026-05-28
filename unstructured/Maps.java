import java.util.HashMap;
import java.util.Map;

public class Maps {
   public static void main(String[] args) {
     Map <Integer,String> mapp= new HashMap<>();
      HashMap <String,String> mapp2= new HashMap<>();

mapp.put(1,"Karishma");

mapp.put(2, "naina");

mapp.put(2, "naina");
System.out.println(mapp);

System.out.println(mapp.keySet());
System.out.println(mapp.values());
System.out.println(mapp.entrySet());
   } 
}
