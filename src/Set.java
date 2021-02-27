import java.util.*;
public class Set
{
        public static void main(String[] ar)
        {
            Scanner sc = new Scanner(System.in);
            int[] arr = {59,90,32,41,56,12,67,12,20,2};
            for(int i = 1;i < arr.length;i++)
            {
                int key = arr[i];
                int j = i-1;
                while(j >= 0 && arr[j]>key)
                {
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
            for(int i : arr)
            {
                System.out.print(i+" ");
            }
        }
}
