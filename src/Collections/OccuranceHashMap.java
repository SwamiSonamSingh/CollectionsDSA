package Collections;
import java.util.*;
import java.util.HashMap;
import java.util.Set;
public class OccuranceHashMap
{
    public static void main(String[] args)
    {
        int[] arr={6,5,5,5,4,4,3,6,6,2,2,};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i])==false)
            {
                hm.put(arr[i],1);
            }
            else
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        Set<Integer> s=hm.keySet();
        for(int i:s)
        {
            System.out.println("Occurance of: "+i+" is: "+hm.get(i));
        }
    }
}
