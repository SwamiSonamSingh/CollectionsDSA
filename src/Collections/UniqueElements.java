package Collections;
import java.util.*;
import java.util.Set;
public class UniqueElements
{
    public static void main(String[] args)
    {
        int[] arr={9,5,3,5,4,6,2,3,4,5,9};
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.add(arr[i]);
        }
        System.out.println("Unique values are:");
        for(int i:hm)
        {
            System.out.print(i+" ");
        }
    }
}
