package Practice;

public class RecursionPower
{
    public static void main(String[] args)
    {
        System.out.println(power(2,5));
    }
    public static int power(int num1,int num2)
    {
        if(num2==0)
        {
            return 1;
        }
        if(num2%2==0)
        {
            //method 1 for returning value
            //int powertill=power(num1,num2-1);
            //int sol=num1*powertill;
            //return sol;
            //method 2 for returning value
            return power(num1*num1,num2/2);
        }
        //int powertill=power(num1,num2-1);
        //int res=num1*powertill;
        //return res;
        return num1 * power(num1 * num1, num2 / 2);
    }
}
