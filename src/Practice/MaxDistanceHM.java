package Practice;
import java.util.HashMap;
public class MaxDistanceHM
{
    public static void main(String[] args)
    {
        int dist=-1;
        int[] arr={1,5,4,1,4,5,2,9,9,5};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            Integer prev=hm.get(arr[i]);
            if(prev==null)
            {
                hm.put(arr[i],i);
            }
            else
            {
                dist=Math.max(dist,prev);
            }
        }
        System.out.println(dist);
    }
}
