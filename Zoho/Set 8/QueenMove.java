/*
https://www.geeksforgeeks.org/number-cells-queen-can-move-obstacles-chessborad/
Consider a N X N chessboard with a Queen and K obstacles.
The Queen cannot pass through obstacles. Given the position (x, y) of Queen,
the task is to find the number of cells the queen can move.
Examples: 

Input : N = 8, x = 4, y = 4, 
        K = 0
Output : 27

------------------------------

Input : N = 8, x = 4, y = 4, 
        K = 1, kx1 = 3, ky1 = 5
Output : 24


*/

public class QueenMove {

    public static boolean obstacle(int x,int y,int[] obs)
    {
        boolean  hit = false;

        for(int i=0;i<obs.length;i+=2)
        {
            if(obs[i]==x && obs[i+1]==y)
            {
               hit = !hit;
               break;
            }
        }

        return hit;

    }


    public static int getMoveCount(int N,int x,int y,int[] obs,String way)
    {
       int  count = 0;
       if(way.equals("t"))
       {
         for(int i=x;i<N;i++)
         {
            x++;
            if(!obstacle(x,y,obs))
              count++;
            else
              break;
         }
        
       }
       else if(way.equals("rt"))
       {
        for(int i=x;i<N;i++)
        {
           x++;
           y++;
           if(!obstacle(x,y,obs))
             count++;
           else
             break;
        } 
      
       }
       else if(way.equals("r"))
       {
        for(int i=y;i<N;i++)
        {
           y++;
           if(!obstacle(x,y,obs))
             count++;
           else
             break;
        } 
       
       }
       else if(way.equals("rb"))
       {
         for(int i=x;i<N-1;i++)
         {
            x--;
            y++;
           if(!obstacle(x,y,obs))
           {
             count++;
           }
           else
             break;
         }
        
       }
       else if(way.equals("b"))
       {
        for(int i=x;1<i;i--)
        {
          x++;
          if(!obstacle(x,y,obs))
            count++;
          else
            break;
        }   
      
       }
       else if(way.equals("lb"))
       {
        for(int i=y;1<i;i--)
        {
          x++;
          y--;
          if(!obstacle(x,y,obs))
            count++;
          else
            break;
        }  
      
       }
       else if(way.equals("l"))
       {
        for(int i=y;1<i;i--)
        {
          y--;
          if(!obstacle(x,y,obs))
            count++;
          else
            break;
        }    
     
       }
       else if(way.equals("tl"))
       {
        for(int i=y;1<i;i--)
        {
          y--;
          x--;
          if(!obstacle(x,y,obs))
            count++;
          else
            break;
        }   
      
       }
      

       return count;
    }



 public static void main(String args[])
 {
   int n = 8,x=4,y=4,k=0;
   int obs[] = new int[k*2];
//    obs[0] = 3;
//    obs[1] = 5; 
   int moves = 0;
   String[] arr = {"t","rt","r","rb","b","lb","l","tl"};

   for(int i=0;i<arr.length;i++)
      moves+=getMoveCount(n,x,y,obs,arr[i]); 

   System.out.print("Total Move Count : "+moves);
   
 }
}
