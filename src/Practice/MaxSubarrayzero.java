package Practice;

public class MaxSubarrayzero
{
    public static void main(String[] args)
    {
        int arr[] = {12,-8,-4,-4,-2,-12,2,-2};
        max(arr);
        //System.out.println(maxlength);
    }
    public static int max(int arr[])
    {
        int maxlength=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum=sum+arr[j];
                if(sum==0)
                {
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }
        }
        System.out.println(maxlength);
        return maxlength;
    }
}
