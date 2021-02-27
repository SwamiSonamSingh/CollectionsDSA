package Practice;
import java.util.*;
public class MinimumStepTrevel
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source co-ordinates:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("Enter destination co-ordinates:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        int result=Math.max(Math.abs(x1-x2),Math.abs(y1-y2));
        System.out.println("Minimum steps travel:"+result);
    }
}
