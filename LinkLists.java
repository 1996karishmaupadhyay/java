import java.util.*;
public class LinkLists {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(2);
        list.add(6);
        list.add(7);
          list.add(7);
            list.add(7);
              list.add(7);
        list.add(9);
        list.addFirst(678);
        list.addLast(876);
        System.out.println(list);
        System.out.println(list.lastIndexOf(7));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peek());

        System.out.println("polling" + list.poll()); //return first element and remove it 
        System.out.println(list);
    }
    }
