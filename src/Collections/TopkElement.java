package Collections;
import java.util.PriorityQueue;
public class TopkElement
{
    public static void main(String[] args)
    {
        int k=3;
        int[] arr={56,11,34,21,78,95,58,35,10};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            if(pq.size()<k)
            {
                pq.add(arr[i]);
            }
            else
            {
                if (pq.peek() < arr[i])
                {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while(pq.isEmpty()==false)
        {
            System.out.println(pq.remove()+" ");
        }
    }
}
