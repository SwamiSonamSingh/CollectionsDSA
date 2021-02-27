package Practice;
import java.util.*;
public class FindingMavDiv
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=-1;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int div=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%div==0)
            {
                max=Math.max(max,arr[i]);
            }
        }
        System.out.println(max);
    }
}
