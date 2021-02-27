package Practice;
import java.util.*;
public class SubarraySum
{
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        int [] arr={-2,1,-3,4,-1,2,1,-5,24};
        int currentsum=arr[0];
        int optimalsum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           if(currentsum<0)
           {
               currentsum=arr[i];
           }
           else if(currentsum>=0)
           {
               currentsum+=arr[i];
           }
           optimalsum=Math.max(currentsum,optimalsum);
        }
        System.out.println("Max subarray sum is:"+optimalsum);
    }
}
