package Practice;
import java.util.*;
public class InsertonSort1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int temp=arr[n-1];
        for(int i=arr.length-1;i>=0;i--)
        {
            int counter=i-1;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[counter]>temp)
                {
                    arr[counter+1]=arr[counter];
                }
                else
                {
                    arr[counter+1]=temp;
                    i=-1;
                }
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
