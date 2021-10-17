class pattern11
{
    public static void main(String args[])
    {
        int n=5;
        
        for(int i=0;i<=n;i++)
        {  
            for(int j=n ; j>=(n+1)-i ; j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}



/* 
OUTPUT
5
54
543
5432
54321
*/