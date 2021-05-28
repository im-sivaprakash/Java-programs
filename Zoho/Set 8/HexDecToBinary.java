import java.util.*;

public class HexDecToBinary {

    public static String removeZero(String Bin,char ch)
    {
        boolean flag = false;
        String res = "";
        
        if(ch=='l')
        {
            for(int i=0;i<Bin.length();i++)
            {
                if(Bin.charAt(i)=='1')
                flag = true;
    
                if(flag)
                res += Bin.charAt(i);
             
            }
        }
        else
        {
            for(int i=Bin.length()-1;0<=i;i--)
            {
                if(Bin.charAt(i)=='1')
                flag = true;
    
                if(flag)
                res = Bin.charAt(i) + res;
             
            }

        }

        return res;
        
    }
    public static void main(String[] args) {
       
        String BinWithZero = "";
        String result = "";
        Map<Character,String> bin = new HashMap<Character,String>();

        bin.put('0',"0000");
        bin.put('1',"0001");
        bin.put('2',"0010");
        bin.put('3',"0011");
        bin.put('4',"0100");
        bin.put('5',"0101");
        bin.put('6',"0110");
        bin.put('7',"0111");
        bin.put('8',"1000");
        bin.put('9',"1001");
        bin.put('A',"1010");
        bin.put('B',"1011");
        bin.put('C',"1100");
        bin.put('D',"1101");
        bin.put('E',"1110");
        bin.put('F',"1111");


        String hexDec = "794A1.5B36";
    
        
        int point = hexDec.indexOf(".");
     

        if(point!=-1)
        {
            String l = hexDec.substring(0, point);
            String r = hexDec.substring(point+1);

    
            String left  = "";
            String right = "";

            for(int i=0;i<l.length();i++)
            {
                left += bin.get(l.charAt(i));
            }

            for(int i=0;i<r.length();i++)
            {
                right += bin.get(r.charAt(i));
            }
            result += removeZero(left,'l')+"."+removeZero(right,'r');
        }
        else
        {
          for(int i=0;i<hexDec.length();i++)
           {
            if(hexDec.charAt(i)=='.')
            {
                BinWithZero +=  hexDec.charAt(i);
            }
            else
            {
               BinWithZero += bin.get(hexDec.charAt(i));   
            }
          }
          result = new String(removeZero(BinWithZero,'l'));
        }


        System.out.print(result);

        

    

    }
}


/*
import java.util.*;

public class HexDecToBinary {

    public static String removeZero(String Bin,char ch)
    {
        boolean flag = false;
        String res = "";
        
        if(ch=='l')
        {
            for(int i=0;i<Bin.length();i++)
            {
                if(Bin.charAt(i)=='1')
                flag = true;
    
                if(flag)
                res += Bin.charAt(i);
             
            }
        }
        else
        {
            for(int i=Bin.length()-1;0>i;i--)
            {
                if(Bin.charAt(i)=='1')
                flag = true;
    
                if(flag)
                res += Bin.charAt(i);
             
            }
        }

        return res;
        
    }
    public static void main(String[] args) {
       
        String BinWithZero = "";
        String result = "";
        Map<Character,String> bin = new HashMap<Character,String>();

        bin.put('0',"0000");
        bin.put('1',"0001");
        bin.put('2',"0010");
        bin.put('3',"0011");
        bin.put('4',"0100");
        bin.put('5',"0101");
        bin.put('6',"0110");
        bin.put('7',"0111");
        bin.put('8',"1000");
        bin.put('9',"1001");
        bin.put('A',"1010");
        bin.put('B',"1011");
        bin.put('C',"1100");
        bin.put('D',"1101");
        bin.put('E',"1110");
        bin.put('F',"1111");


        String hexDec = "794A1.5B36";
        
        int point = hexDec.indexOf(".");
     

        if(point!=-1)
        {
            String arr[] = hexDec.split(".");

            String left  = "";
            String right = "";

            for(int i=0;i<arr[0].length();i++)
            {
                left += bin.get(arr[0].charAt(i));
            }

            for(int i=0;i<arr[1].length();i++)
            {
                right += bin.get(arr[1].charAt(i));
            }

            result += removeZero(left,'l')+"."+removeZero(right,'r');
        }
        else
        {
          for(int i=0;i<hexDec.length();i++)
           {
            if(hexDec.charAt(i)=='.')
            {
                BinWithZero +=  hexDec.charAt(i);
            }
            else
            {
               BinWithZero += bin.get(hexDec.charAt(i));   
            }
          }
          result = new String(removeZero(BinWithZero,'l'));
        }


        System.out.print(result);

        

    

    }
}





*/