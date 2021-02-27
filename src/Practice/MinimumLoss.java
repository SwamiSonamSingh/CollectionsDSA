package Practice;
import java.util.*;
public class MinimumLoss
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long [] price=new long[n];
        for(int i=0;i<price.length;i++)
        {
            price[i]=sc.nextInt();
        }
        long result=0;
        long s=Integer.MAX_VALUE;
        for(int i=0;i<price.length-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                result=Math.abs(price[i]-price[j]);
            }
            if(result>0 && result<s)
            {
                s=result;
            }
        }
        System.out.println(s);
    }
}
