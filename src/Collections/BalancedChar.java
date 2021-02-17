package Collections;
import java.util.Stack;
public class BalancedChar
{
    public static void main(String[] args)
    {
        String s="()[][]{}";
        boolean b=true;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')
            {
                st.push(ch);
            }
            else
            {
                if (s.isEmpty() == true)
                {
                    b = false;
                    break;
                }
                else if (ch == ')' && st.peek() == '(')
                {
                    st.pop();
                }
                else if (ch == '}' && st.peek() == '{')
                {
                    st.pop();
                }
                else if (ch == ']' && st.peek() == '[')
                {
                    st.pop();
                }
                else
                {
                    b = false;
                    break;
                }
            }
        }
        if(b==true)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not balanced");
        }
    }
}
