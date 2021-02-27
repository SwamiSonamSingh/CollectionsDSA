package Practice;
import java.util.*;
public class Sumoddeven
{
    public static void main(String[] args)
    {
        long sumeven=0;
        long sumodd=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the max bound:");
        int max=sc.nextInt();
        for(int i=1;i<=max;i++)
        {
            if(i>=2 && i%2==0)
            {
                sumeven=sumeven+i;
            }
            else
            {
                sumodd=sumodd+i;
            }
        }
        System.out.println("Sum of even number:"+sumeven);
        System.out.println("Sum of odd number :"+sumodd);
    }
}
