package Collections;
import java.util.*;
import java.util.HashMap;
public class RepeatingString
{
    public static void main(String[] args)
    {
        String s="swami sonam singh";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                System.out.println(s.charAt(i)+" First repeating character");
                break;
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
    }
}
