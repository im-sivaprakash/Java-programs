class ArrMaxElement
{
    public static int  findMax(int val)
    {
        int sum = 0;
        int mul = 1;
        while(val!=0)
        {
            sum+=val%10;
            mul*=val%10;
            val/=10;
        }
        return (sum > mul) ? sum : mul;
    }
    public static void main(String args[])
    {
        int arr[] = {120 ,24 ,71 ,10 ,59};

        for(int i=0;i<arr.length;i++)
         System.out.print(findMax(arr[i])+" ");
    }
}



