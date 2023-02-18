import java.util.*;
public class priority_queues {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("A");
        queue.offer("D");
        queue.offer("C");
        // System.out.println(queue);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        

    }
}
