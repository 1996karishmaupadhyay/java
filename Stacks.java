import java.util.*;
public class Stacks {
    public static void main(String[] args) {
    //     Stack<Integer> stck= new Stack<>();
    //     stck.add(3);
    //     stck.add(8);
    //     stck.add(18);
    //     System.out.println(stck);
    //     stck.push(87);
    //    System.out.println(stck.pop());
    //     System.out.println(stck.peek());
    //     System.out.println(stck.search(3));
    //          System.out.println(stck.search(99));
    //          System.out.println(stck.empty());
    //     System.out.println(stck);
        
     Deque<Integer> stack=new ArrayDeque<>();
     stack.push(78);
     stack.push(98);
     stack.push(67);
     System.out.println(stack);
     stack.pop();
     System.out.println(stack);
     System.out.println(stack.peek());
    }
}
