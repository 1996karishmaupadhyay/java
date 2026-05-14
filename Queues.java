import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Deque<Integer> q1 = new ArrayDeque<>();
        Deque<String> q2 = new LinkedList<>();
        Queue<Integer> q3 = new PriorityQueue<>((a,b)->b-a);
        q1.add(23);
        q1.add(56);
        q1.offer(78);
        System.out.println(q1.element());
        System.out.println(q1.peek());
        System.out.println(q1);
        q3.add(74);
        q3.add(99);
        q3.add(12);
       System.out.println(q3); 
       System.out.println(q3.poll());

    }
}
