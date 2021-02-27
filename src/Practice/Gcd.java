package Practice;
import java.util.*;
public class Gcd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        int gcd=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;i<arr.length-1;j++)
            {

            }
        }
        //System.out.println(min);
    }
}
