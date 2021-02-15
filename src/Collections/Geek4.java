package Collections;
import java.util.*;
import java.util.Stack;
public class Geek4
{
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(68);
        s.push(67);
        s.push(65);
        s.push(34);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
    }
}
