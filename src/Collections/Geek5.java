package Collections;
import java.util.*;
import java.util.Queue;
public class Geek5
{
    public static void main(String[] args)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(67);
        q.add(98);
        q.add(78);
        q.add(67);
        System.out.println(q);
        q.remove(78);
        System.out.println(q);
        System.out.println(q.peek());
    }
}
