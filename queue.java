import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        // System.out.println(queue.isEmpty());
        queue.add("kooky");
        queue.add("loony");
        queue.add("rattle");
        queue.add("beast");
        queue.offer("price");
        // System.out.println(queue.size());
        System.out.println(queue.contains("loony"));
        // queue.remove();
        // queue.poll();
        // System.out.println(queue.peek());
        // System.out.println(queue);

        



    }
}
