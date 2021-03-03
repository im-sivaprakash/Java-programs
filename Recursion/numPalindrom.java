import java.util.Scanner;
class numPalindrom {
    
    public static boolean isOneDigit(int num)
    {
     return (num <= 9) ? true : false;
    }
    
    public static int logic(int num,int temp)
    {
        if(num==0)
        {
            return temp;
        }
        return logic(num/10,temp * 10 + num%10);
    }
    
    public static int palindrom(int num)
    {
      int val = 0;
      
      if(isOneDigit(num))
      {
        val = num;
      }
      else
      {
        int temp = 0;
        val = logic(num,temp);
      }
      
      return val;
    }
    
    
    public static void main (String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print((num == palindrom(num)) ? "YES" : "NO");
    }
}
