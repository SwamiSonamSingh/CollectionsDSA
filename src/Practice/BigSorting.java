package Practice;
import java.util.*;
import java.util.Comparator;
public class BigSorting
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] arr=new String[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.next();
        }
        Arrays.sort(arr,new comp());
        for(String s: arr)
        {
            System.out.println(s);
        }
    }
    static class comp implements Comparator<String>
    {
        public int compare(String a,String b)
        {
            if(a.length()<b.length())
            {
                return -1;
            }
            if (a.length()>b.length())
            {
                return 1;
            }
            return a.compareTo(b);
        }
    }
}
