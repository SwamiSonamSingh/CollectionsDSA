package Bubble;
import java.util.Scanner;
public class Test4
{
    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={59 ,90 ,32 ,41 ,56 ,12 ,67 ,12 ,20,2};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<(arr.length-i-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
