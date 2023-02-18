import java.util.*;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");
        linkedlist.add(4,"E");
        linkedlist.remove("E");
        // System.out.println(linkedlist.indexOf("C"));
        // System.out.println(linkedlist.peekFirst());
        // System.out.println(linkedlist.peekLast());
        linkedlist.addFirst("0");
        linkedlist.addLast("G");
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println(linkedlist);



        // linkedlist.poll();
        // System.out.println(linkedlist);




    }
}
