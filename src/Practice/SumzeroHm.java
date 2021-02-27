package Practice;
import java.util.*;
public class SumzeroHm
{
    public static int subarraylength(int arr[])
    {
        int sum=0;
        int maxlength=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            Integer previous=hm.get(sum);
            if(arr[i]==0 && maxlength==0)
            {
                maxlength=1;
            }
            if(sum==0)
            {
                maxlength=i+1;
            }
            if(previous==null)
            {
                hm.put(sum,i);
            }
            else
            {
                maxlength=Math.max(maxlength,i-previous);
            }
        }
        System.out.println(maxlength);
        return maxlength;
    }
    public static void main(String[] ar)
    {
        int arr[]={12,8,4,-4,-8,-12,2,-4};
        subarraylength(arr);
    }
}
