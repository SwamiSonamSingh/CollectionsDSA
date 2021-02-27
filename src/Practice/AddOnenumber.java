package Practice;
import java.util.*;
public class AddOnenumber
{
    public static void main(String[] args){
        Vector<Integer> num = new Vector<Integer>();
        num.add(3);
        num.add(8);
        num.add(9);
        int carry=1;
        for(int i=num.size()-1;i>=0;i--)
        {
            int d=num.get(i)+carry;
            carry=d/10;
            num.set(i,d%10);
        }
        if(carry==1)
        {
            num.add(0,1);
        }
        System.out.println(num);
    }
}
