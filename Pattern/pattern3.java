class pattern3

{
    public static void main(String args[])
    {
        
        
// Same Logic  
//-----------
//         int n=5;
//         for(int i=0;i<=n;i++)
//         {
//             System.out.println("ABCDE");
//         }
        
        
        
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
