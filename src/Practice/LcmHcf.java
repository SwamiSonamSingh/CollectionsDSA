package Practice;
import java.util.*;
public class LcmHcf
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int max=0;
        for(int i=1;i<=num1;i++)
        {
            if(num1%i==0 && num2%i==0)
            {
                max=Math.max(max,i);
            }
        }
        //System.out.println(max);
        int lcm=(num1*num2)/max;
        System.out.println(lcm);
    }
}
