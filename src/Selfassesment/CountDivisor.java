package Selfassesment;
import java.util.*;
public class CountDivisor
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        if(l<r)
        {
            for(int i=l;i<=r;i++)
            {
                if(i%k==0)
                {
                    count++;
                }
            }
        }
        if(l>r)
        {
            for(int i=r;i<=l;i++)
            {
                if(i%k==0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
