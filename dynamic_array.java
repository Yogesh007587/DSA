import java.util.*;
import java.util.ArrayList;
class dynamicarray{
    int size;
    int capacity = 10;
    Object[] array;
    public dynamicarray(){
        this.array = new Object[capacity];
    }
    public dynamicarray(int capacity ){
        this.capacity=capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if(size>=capacity){
            grow();
        }
        array[size]=data;
        size++;
    }
    public void insert(int index,Object data){
        if(size>=capacity){
            grow();
        }
        for(int i=size;i>index;i--){
            array[i]=array[i-1];
        }
        array[index]=data;
        size++;
    }
    public void delete(Object data){
        for(int i=0;i<size;i++){
            if(array[i]==data){
                for(int j=0;j<(size-i-1);j++){
                    array[i+j]=array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if(size<=(int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }
    public int search(Object data){
        for(int i=0;i<size;i++){
            if(array[i]==data){
                return 1;
            }
        }
        return -1;
    }
    public void grow(){
        int newCapacity = (int)(capacity*2);
        Object[] newArray = new Object[newCapacity];
        for(int i=0;i<size;i++){
            newArray[i]=array[i];
        }
        capacity=newCapacity;
        array=newArray;
    }
    public void shrink(){
        int newCapacity = (int)(capacity/2);
        Object[] newArray = new Object[newCapacity];
        for(int i=0;i<size;i++){
            newArray[i]=array[i];
        }
        capacity=newCapacity;
        array=newArray;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public String toSring(){
        String string = "";
        for(int i=0;i<capacity;i++){
            string+=array[i]+", ";
        }
        if(string != ""){
            string = "[" + string.substring(0, string.length()-2) + "]";
        }
        else{
            string = "[]";
        }
        return string;
    }
}
public class dynamic_array{
    public static void main(String[] args) {
        // ArrayList<String> arraylist = new ArrayList<>();
        dynamicarray dynamicArray = new dynamicarray(6);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");




        // dynamicArray.insert(0,"x");
        // dynamicArray.delete("A");
        // System.out.println(dynamicArray.search("C"));
         
        System.out.println(dynamicArray.toSring());
        System.out.println("size: "+ dynamicArray.size);
        System.out.println("capacity: "+ dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());



    }
}