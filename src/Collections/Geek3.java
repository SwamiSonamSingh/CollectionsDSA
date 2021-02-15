package Collections;
import java.util.HashMap;
import java.util.*;
public class Geek3
{
    public static void main(String[] arg)
    {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Saket");
        hm.put(2,"Nazir");
        hm.put(3,"Ankita");
        hm.put(4,"Ankit");
        hm.put(5,"Swami");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+"--->"+m.getValue());
        }
        System.out.println(hm.get(2));
        System.out.println(hm.remove(5));
    }
}
