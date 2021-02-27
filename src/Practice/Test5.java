package Practice;
import java.util.*;
public class Test5
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int result=0;
        for(int i=0;i<n;i++)
        {
            if(k>arr[i])
            {
                result++;
            }
        }
        System.out.println(result);
    }
}
