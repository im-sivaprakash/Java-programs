/*
Input: 110001110
Output: 18E

Input: 1111001010010100001.010110110011011
Output: 794A1.5B36
*/

import java.util.HashMap;
import java.util.Map;

public class BinaryToHexDec {

    public static int indexOf(String inp,char ch)
    {
        int index = -1;
        for(int i=0;i<inp.length();i++)
        {
            if(inp.charAt(i)==ch)
            {
                index = i;
                break;
            }
        }
        return index;
    }
    public static String subString(String str,int start,int end)
    {
        String result = "";
        for(int i=start;i<=end;i++)
            result+=str.charAt(i);

        return result;
    }

    public static String converter(String bin)
    {
       
        String result = "";

        Map<String,Character> bv = new HashMap<String,Character>();
        bv.put("0000",'0');
        bv.put("0001",'1');
        bv.put("0010",'2');
        bv.put("0011",'3');
        bv.put("0100",'4');
        bv.put("0101",'5');
        bv.put("0110",'6');
        bv.put("0111",'7');
        bv.put("1000",'8');
        bv.put("1001",'9');
        bv.put("1010",'A');
        bv.put("1011",'B');
        bv.put("1100",'C');
        bv.put("1101",'D');
        bv.put("1110",'E');
        bv.put("1111",'F');


      
        for(int i=0;i<bin.length();i+=4)
        {
           result += bv.get(subString(bin,i,i+3));
        }


        return result;

    }

    public static String addZero(String bin,char ch)
    {
       int  i=0;
       for(i=0;i<4;i++)
              if((bin.length()+i)%4==0)
                break;

       
       for(int j=0;j<i;j++)
         if(ch=='r')
            bin = bin+"0"; 
         else
            bin = "0"+bin;

       return bin;
    }


    public static String ConvertBinToHex(String inp)
    {

        String HexDec = "";

        int point = indexOf(inp,'.'); 
        if(point!=-1)
        {
          String left = subString(inp,0,point-1),
                 right = subString(inp,point+1,inp.length()-1);
        
           if(left.length()%4!=0)
           {
            left =  addZero(left,'l');
           }
           
           if(right.length()%4!=0)
           {
            right = addZero(right,'r');
            
           }
         
          HexDec += converter(left) +"."+converter(right) ;
         
        }
        else
        {
            if(inp.length()%4==0)
              HexDec +=converter(inp);
            else
            HexDec +=converter(addZero(inp,'l'));  
        }

        return HexDec;
    }


    public static void main(String arg[])
    {
        //String input = "1111001010010100001.010110110011011";
        //String input = "110001110";
        String input = "1111001010010100001.010110110011011";
        System.out.print(ConvertBinToHex(input));
    }
}
