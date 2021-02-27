package Practice;
import java.util.*;
public class IcecreamParlor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cost=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==cost)
                {
                    System.out.println((i+1)+" "+(j+1));
                }
            }
        }
    }
}
