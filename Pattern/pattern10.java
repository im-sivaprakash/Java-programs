class pattern10
{
    public static void main(String args[])
    {
        int n=5;
        
        // Same Logic
        // for(int i=n;i>=0;i--)
        // {  
        //     for(int j=n-i;j>0;j--)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



        for(int i=0;i<=n;i++)
        {  
            for(int j=i;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }


    }
}



/* 
OUTPUT
1
21
321
4321
54321
*/