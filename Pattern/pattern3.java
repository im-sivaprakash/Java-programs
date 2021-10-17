class pattern3

{
    public static void main(String args[])
    {
        int n=5;
        char alpha = 'A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(alpha++);
            }
            alpha = 'A';
            System.out.println();
        }
    }
}



/* 
OUTPUT

ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
*/