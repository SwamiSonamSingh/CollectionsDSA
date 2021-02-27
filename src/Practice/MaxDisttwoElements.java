package Practice;

public class MaxDisttwoElements
{
    public static void main(String[] args)
    {
        int length=0;
        int arr[]={6,2,4,3,2,1,4,5,6,5};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    length=Math.max(length,j-i+1);
                }
            }
        }
        System.out.println(length);
    }
}
