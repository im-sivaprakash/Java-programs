class SnakePattern
{
    public static void main(String[] args) {
        int        n = 4;
        int      val = 1;

        for(int ind=0;ind<n;ind++)
        {
            for(int j=0,temp=val;j<n && ind%2==0 ;j++)
            {
                System.out.print(temp+++" ");
            }
            for(int j=0,temp=val+n-1;j<n && ind%2!=0 ;j++)
            {
                System.out.print(temp--+" "); 
            }

            val+=n;

            System.out.println();

        }

    }
}