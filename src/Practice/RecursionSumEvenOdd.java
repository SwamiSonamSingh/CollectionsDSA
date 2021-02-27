package Practice;

public class RecursionSumEvenOdd
{
    public static void main(String[] args)
    {
        System.out.println(sumeven(6));
        System.out.println(sumodd(7));
    }
    public static int sumeven(int num)
    {
        if(num==2)
        {
            return 2;
        }
            return num + sumeven(num - 2);
    }
    public static int sumodd(int num1)
    {
        if(num1==1)
        {
            return 1;
        }
        return num1+sumodd(num1-2);
    }
}
