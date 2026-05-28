import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
public class collections {
    public static void main(String[] args) {
       ArrayList<Integer> arr1= new ArrayList<>();
       List<Integer> arr2= new ArrayList<>();
       Collection<Integer> arr3= new ArrayList<>();
       arr1.add(10);
       arr1.add(20);
       System.out.println(arr1);
       arr2.add(12);
       arr2.add(68);
       arr2.add(76);
       System.out.println(arr2);
       arr3.add(34);
       arr3.add(34);
       arr3.add(34);
       arr3.add(34);
       arr3.add(34);
       arr3.add(34);
       arr3.add(34);
       arr3.add(34);
       System.out.println(arr3);
       arr2.remove(1);
       System.out.println(arr2);
       arr1.addAll(arr2);
       System.out.println(arr1);
       arr1.removeAll(arr2);
       System.out.println(arr1);
       System.out.println(arr1.size());
       arr2.clear();
       System.out.println(arr2.size());
       Iterator<Integer> iterator=arr3.iterator();
       while (iterator.hasNext()) {
        System.out.println("el:" + iterator.next());
       }
    }
}
