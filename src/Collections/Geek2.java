package Collections;
import java.util.Collections;
import java.util.LinkedList;
public class Geek2
{
    public static void main(String[] ar)
    {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(67);
        list.add(65);
        list.add(95);
        list.add(11);
        list.add(54);
        list.add(99);
        System.out.println("List elements:"+list);
        list.add(4,89);
        System.out.println("Adding at given index:"+list);
        list.addFirst(89);
        System.out.println("Adding at first:"+list);
        list.addLast(78);
        System.out.println("Adding at last:"+list);
        list.removeFirst();
        System.out.println("Removing at first:"+list);
        list.removeLast();
        System.out.println("Removing at last:"+list);
        list.remove(3);
        System.out.println("Removing at given index:"+list);
        System.out.println("First elements in the list:"+list.getFirst());
        System.out.println("Last element in the list:"+list.getLast());
    }
}
