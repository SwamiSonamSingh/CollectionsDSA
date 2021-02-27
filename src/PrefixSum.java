import java.util.*;
public class PrefixSum
{
    public static void main(String[] ar)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no. of element:");
      int n=sc.nextInt();
      int []arr=new int[n];
      System.out.println("Enter the array element:");
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      System.out.println("Enter the range:");
      int left=sc.nextInt();
      int right=sc.nextInt();
      int prefix[]=new int[n];
      prefix[0]=arr[0];
      if(left>0)
      {
          for (int i = 1; i < n; i++)
          {
              prefix[i] = prefix[i - 1] + arr[i];
          }
          int result = prefix[right] - prefix[left - 1];
          System.out.println("Prefix sum from " + left + " to " + right + " is:" + result);
      }
      int sum=0;
      if(left==0)
      {
          for(int i=0;i<=right;i++)
          {
              sum=sum+arr[i];
          }
          System.out.println("Prefix sum from "+left+" to "+right+" is:"+sum);
      }
    }
}
