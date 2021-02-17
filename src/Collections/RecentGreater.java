package Collections;
import java.util.ArrayList;
import java.util.Stack;
public class RecentGreater
{
    public static void main(String[] args)
    {
        int[] arr={5,3,6,2,7,9,4,8,2};
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty() && s.peek()<arr[i])
            {
                s.pop();
            }
            if(s.isEmpty()==true)
            {
                ans.add(-1);
            }
            else
            {
                ans.add(s.peek());
            }
            s.push(arr[i]);
        }
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
    }
}
