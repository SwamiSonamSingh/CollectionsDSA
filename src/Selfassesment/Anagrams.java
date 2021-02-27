package Selfassesment;
import java.util.*;
public class Anagrams
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int j=0; j<t; j++)
        {
            int arr[] = new int[26];
            String str1 = s.next();
            String str2 = s.next();
            for (int i = 0; i < str1.length(); i++)
            {
                arr[str1.charAt(i) - 'a']++;
            }
            for (int i = 0; i < str2.length(); i++)
            {
                arr[str2.charAt(i) - 'a']--;
            }
            int ans = 0;
            for (int i = 0; i < 26; i++)
            {
                ans += Math.abs(arr[i]);
            }
            System.out.println(ans);
        }
    }
}
