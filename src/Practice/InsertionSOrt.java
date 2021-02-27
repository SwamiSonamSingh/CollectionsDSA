package Practice;
import java.util.*;
public class InsertionSOrt
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=false;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=arr[n-1];
        for(int i=n-2;i>=-1;i--)
        {
            if(i!=-1)
            {
                if (temp < arr[i])
                {
                    arr[i + 1] = arr[i];
                }
                else
                    {
                    arr[i + 1] = temp;
                    flag=true;
                    }
            }
            else
            {
                arr[0]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
            System.out.println();
            if(flag)
            {
                break;
            }
        }
    }
}
