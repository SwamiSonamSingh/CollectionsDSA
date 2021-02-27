package Practice;
import java.util.*;
public class SherlockArray
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
        int sum=0;
        int temp=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        for(int j=0;j<n;j++)
        {
            if(2*temp==sum-arr[j])
            {
                System.out.println("YES");
            }
            temp=temp+arr[j];
        }
    }
}
