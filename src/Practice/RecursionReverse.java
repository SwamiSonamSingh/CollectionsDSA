package Practice;
public class RecursionReverse
{
    public static void main(String[] args)
    {
        reverse(10);
    }
    public static void reverse(int num)
    {
        if(num==1)
        {
            System.out.println(num);
            return;
        }
        System.out.println(num);
        reverse(num-1);
    }
}
