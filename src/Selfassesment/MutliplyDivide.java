package Selfassesment;
import java.util.*;
public class MutliplyDivide
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length;i++) {
          int count = 0;
          while (arr[i] > 0) {
              if (arr[i] == 1) {
                  break;
              } else if (arr[i] % 6 == 0) {
                  arr[i] = arr[i] / 6;
              } else {
                  arr[i] = arr[i] * 2;
              }
              count++;
          }
          if(arr[i]!=1)
          {
              count=-1;
              System.out.println(count);
          }
          else
          {
              System.out.println(count);
          }
      }
    }
}
