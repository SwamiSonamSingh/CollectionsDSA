package Collections;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQ
{
    public static void main(String[] ar)
    {
       PriorityQueue pq1=new PriorityQueue<>();
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       PriorityQueue<Integer> pq2= new PriorityQueue<>(new integerComparator());
       pq1.add(55);
       pq1.add(78);
       pq1.add(34);
       pq1.add(90);
       System.out.println("Default Ordering:");
       System.out.println(pq1.peek());
       System.out.println(pq1.remove());
       System.out.println(pq1.peek());
       System.out.println(pq1.remove());
       System.out.println("Changed ordering changed by using method:");
       pq.add(55);
       pq.add(78);
       pq.add(34);
       pq.add(90);
       System.out.println(pq.peek());
       System.out.println(pq.remove());
       System.out.println(pq.peek());
       System.out.println(pq.remove());
       pq2.add(55);
       pq2.add(78);
       pq2.add(34);
       pq2.add(90);
       System.out.println("Change order using comprator:");
       System.out.println(pq2.peek());
       System.out.println(pq2.remove());
       System.out.println(pq2.peek());
       System.out.println(pq2.remove());
    }
    static class integerComparator implements Comparator<Integer>
    {
        public int compare(Integer a,Integer b)
        {
            if(a<b)
            {
                return 1;
            }
            else if(a>b)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }
}
