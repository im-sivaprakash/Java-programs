public class Xpattern {
    public static void main(String args[])
   { 
    String s = "HelloZoho";
    
    for(int i=0;i<s.length();i++)
    {
      for(int j=0;j<s.length();j++)
      {
        if(i==j || j+1==s.length()-i)
        {
          System.out.print(s.charAt(j));
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
   }
}


/* Out put
H       o
 e     h
  l   o
   l Z
    o
   l Z
  l   o
 e     h
H       o
*/