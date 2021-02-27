package Practice;

public class RecursionSum
{
    public static int finalsum(int num)
    {
        if(num==1)
        {
            return 1;
        }
       // int sum=finalsum(num-1);
        //int result=sum+num;
        return num+finalsum(num-1);
    }
    public static void main(String[] args)
    {
        System.out.println(finalsum(10));
    }
}
