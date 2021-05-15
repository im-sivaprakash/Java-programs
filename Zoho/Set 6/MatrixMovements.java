class MatrixMovements
 {
    public static String findMovedPos(int x,int y,char[] arr)
    {
      
        for(int i=0;i<arr.length;i++)
        {
         
            switch(arr[i])
            {
                case 'U':
                x--;
                break;
                case 'D':
                x++;
                break;
                case 'R':
                y++;
                break;
                case 'L':
                y--;
                break;
            }
         
        }

        return x+" "+y;
    }
    public static void main(String[] args) {
        char[] arr = {'U' ,'L' ,'R' ,'R' ,'D' ,'D' ,'U' ,'L' ,'R'};
        int x  =  4;
        int y  = 5;
       
        System.out.println(findMovedPos(x,y,arr));
    }
}
