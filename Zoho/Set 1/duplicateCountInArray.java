import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    int[] arr ={2,4,7,1,6,2,1,3,7,7,9,4}; 
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    for(int i=0; i<arr.length;i++)
    { 
      if(map.containsKey(arr[i]))
      {
        map.put(arr[i],map.get(arr[i]) + 1);
      }
      else
      {
        map.put(arr[i],1);
      }
    }
    
    for(Map.Entry<Integer,Integer> set : map.entrySet())
    {
      if(set.getValue()>1)
      System.out.println(set.getKey() +" => "+set.getValue());
       
    }
    
    
   
    
   }
 }
