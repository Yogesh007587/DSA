import java.util.ArrayList;
import java.util.LinkedList;
public class al_vs_ll {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        long starttime;
        long endtime;
        long elapsedtime;
        for(int i=0;i<1000000;i++){
            linkedlist.add(i);
            arraylist.add(i);
        }
        starttime = System.nanoTime();
        // linkedlist.get(0);
        // linkedlist.get(500000);
        // linkedlist.get(999999);
        linkedlist.remove(0);
        endtime = System.nanoTime();
        elapsedtime = endtime-starttime;
        System.out.println("LinkedList:\t"+elapsedtime +"ns");



        starttime = System.nanoTime();
        // arraylist.get(0);
        // arraylist.get(500000);
        // arraylist.get(999999);
        arraylist.remove(0);
        endtime = System.nanoTime();
        elapsedtime = endtime-starttime;
        System.out.println("ArrayList:\t"+elapsedtime +"ns");
    }
}
