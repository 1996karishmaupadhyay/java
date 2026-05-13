import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        Deque<String> q2 = new LinkedList<>();
        Queue<String> q3 = new PriorityQueue<>();
        q1.add(23);
        q1.add(56);
        q1.offer(78);
        System.out.println(q1.element());
        System.out.println(q1.peek());
        System.out.println(q1);

    }
}
