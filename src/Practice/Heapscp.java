package Practice;
import java.util.*;
public class Heapscp
{
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
                //break;
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
