package Practice;
import java.util.*;
public class FirstLastDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int b=num;
        int count=0;
        while(num!=0)
        {
            int rem=num%10;
            count=rem+count*10;
            num=num/10;
        }
        System.out.println(count%10+" "+b%10);
    }
}
