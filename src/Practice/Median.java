package Practice;
import java.util.*;
public class Median
{
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i:arr)
        {
            System.out.println(i+" ");
        }
        int mid=(arr.length)/2;
        System.out.println(arr[mid]);
    }
}
