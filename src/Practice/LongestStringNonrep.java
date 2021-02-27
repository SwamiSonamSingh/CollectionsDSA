package Practice;
import java.util.*;
public class LongestStringNonrep
{
    public static void main(String[] args)
    {
        int count=0;
        String s="abcabcbb";
       if(s==" ")
        {
            count=1;
        }
        else {
            for (int i = 0; i < s.length(); i++)
            {
                HashSet<Character> hs = new HashSet<>();
                for (int j = i; j < s.length(); j++)
                {
                    if (hs.contains(s.charAt(j)))
                    {
                        count = Math.max(count, hs.size());
                        break;
                    }
                    else
                        {
                        hs.add(s.charAt(j));
                    }
                }
            }
        }
        System.out.println(count);
    }
}
