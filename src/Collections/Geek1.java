package Collections;
import java.util.ArrayList;
import java.util.Collections;
public class Geek1
{
    public static void main(String[] ar)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(30);
        list.add(80);
        list.add(75);
        list.add(11);
        System.out.println("Getting the list elements:"+list);
        list.remove(4);
        System.out.println("After removing:"+list);
        System.out.println("Element at given position:"+list.get(5));
        list.set(1,55);
        System.out.println("Adding element at specific pos:"+list);
        Collections.sort(list);
        System.out.println("sorted list:"+list);
        System.out.println("Removing all elements:");
        list.remove(list);
    }
}
