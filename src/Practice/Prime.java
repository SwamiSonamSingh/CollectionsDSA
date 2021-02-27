package Practice;
import java.sql.SQLOutput;
import java.util.*;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the last element:");
        int max=sc.nextInt();
        for(int i=2;i<=max;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if (i % j == 0)
                {
                    count++;
                }
            }
                if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}
