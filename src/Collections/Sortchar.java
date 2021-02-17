package Collections;
import java.util.Comparator;
import java.util.Arrays;
public class Sortchar
{
    public static void main(String[] args)
    {
        Character[] ch={'w','l','a','g','d'};
        Arrays.sort(ch,new Comp());
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]+" ");
        }
    }
    static class Comp implements Comparator<Character>
    {
        public int compare(Character a,Character b)
        {
            if(a<b)
            {
                return 1;
            }
            else if(a>b)
            {
                return -1;
            }
            else
            {
                return 0;
            }
        }
    }
}
