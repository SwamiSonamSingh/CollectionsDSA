package Selfassesment;
import java.util.*;
public class Nonrepeatition
{
    public static String norep(String inputStr){
        if(inputStr == null)
        {
            return null;
        }
        String maxStr = "";
        String tempStr = "";
        for(int i=0; i < inputStr.length(); i++)
        {
            //  if tempStr contains the new similar character which is already in tempStr, then change tempStr
            if(tempStr.contains("" + inputStr.charAt(i)))
            {
                tempStr = tempStr.substring(tempStr.indexOf(inputStr.charAt(i)) + 1);
            }
            //  add new character
            tempStr = tempStr + inputStr.charAt(i);
            //  replace maxStr with tempStr if tempStr is longer than maxStr
            if(maxStr.length() <= tempStr.length())
            {
                maxStr = tempStr;
            }
        }
        return maxStr;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String output = norep(s);
        System.out.println(output.length());
        System.out.println(output);
    }
}
