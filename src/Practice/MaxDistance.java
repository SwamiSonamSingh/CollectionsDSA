package Practice;
import java.util.*;
public class MaxDistance
{
    public static void main(String[] args)
    {
        int[] arr={1,5,4,1,4,5,2,9,9,5};
        int dist=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                dist=Math.max(dist,j-i-1);
            }
        }
        System.out.println(dist);
    }
}
