import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(30);
        pq.add(10);
        System.out.println(pq);
        System.out.println(pq.isEmpty());
        System.out.println(pq);
    }
}