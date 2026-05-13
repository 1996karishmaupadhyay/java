import java.util.*;
public class ListColl {
    public static void main(String[] args) {
        List <Integer> list=new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(9);
         list.add(7);
        System.out.println(list.get(2));
        list.set(2,45);
        System.out.println(list);
        list.toArray();
        System.out.println(list.contains(5));
         //methods
Collections.sort(list);
System.out.println(list);
ArrayList<Integer> newList = new ArrayList<>(list);
System.out.println(newList);
System.out.println(list);
ArrayList<Integer> list3= new ArrayList<>();
list3.ensureCapacity(3);
list3.add(6);
list3.add(90);
list3.add(89);
System.out.println(list3);
System.out.println(list3.size());
list3.add(66);
System.out.println(list3.size());
System.out.println(list3.isEmpty());
System.out.println(list3.indexOf(89));
    }
}
