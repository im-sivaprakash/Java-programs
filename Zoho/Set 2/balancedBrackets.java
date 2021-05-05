import java.util.*;
class balanceBrackets{
    public static void main(String args[])
    {
        String exp = "[()](){[{{}}]}";
        ArrayList<Character> arr = new ArrayList<Character>();
        
        for(int i=0; i<exp.length(); i++)
        {
            if(i==0)
            {
                arr.add(exp.charAt(i));
            }
            else if(arr.size()!=0)
            {
                if(  (arr.get(arr.size()-1) == '['  && exp.charAt(i) == ']')  ||
                      (arr.get(arr.size()-1) == '{' && exp.charAt(i) == '}') ||  
                      (arr.get(arr.size()-1) == '(' && exp.charAt(i) == ')')  )
                {
                   arr.remove(arr.size()-1);
                }
                else
                {
                   arr.add(exp.charAt(i));
                }
            }
            else
            {
                arr.add(exp.charAt(i));
            }
        }
        
        System.out.print( arr.size()==0 ? "Balanced" : "Balance aga poda.." );
    }
}