import java.util.*;
public class CollectionsInterfaces {
    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        System.out.println(collection);
        collection.remove(2);
        // System.out.println(collection);
        // System.out.println(collection.contains(1));
        // System.out.println(collection.size());
        // System.out.println(collection.isEmpty());

        //iterate
        for (Integer i : collection) {
            System.out.println(i);
        }
    }
}
