import java.util.ArrayList;
import java.util.List;

public class collections {
    public static void main(String[] args) {
        List<String> listOfFruits= new ArrayList<>();
         listOfFruits.add("apple");
         listOfFruits.add("banana");
            listOfFruits.add("orange");
            System.out.println(listOfFruits);
            for(String fruit:listOfFruits){
                System.out.println(fruit);
            }
    }
}
