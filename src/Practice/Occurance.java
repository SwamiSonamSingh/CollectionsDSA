package Practice;
import java.util.Arrays;
public class Occurance
{
    public static void main(String[] args)
    {
        int [] arr={70,23,12,45,70,70,23,45,45,45,12,12,23};
        Arrays.sort(arr);
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                System.out.println("Occurance of "+arr[i-1]+" is "+count);
                count=1;
            }
        }
        System.out.println("Occurance of "+arr[arr.length-1]+" is "+count);
    }
}
