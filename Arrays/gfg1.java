

import java.util.HashMap;
class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        
        if(a.length!= b.length){
            return false;
        }
        // code here
       HashMap<Integer,Integer> map1= new HashMap<>();
        HashMap<Integer,Integer> map2= new HashMap<>();
      
      for(int i: a){
          map1.put(i,map1.getOrDefault(i,0)+1);
          
          
      }
      for(int i: b){
         map2.put(i,map2.getOrDefault(i,0)+1);
      }
      
      for(int i=0;i<a.length;i++){
          if(map1.get(a[i]) != map2.get(a[i])){
              return false;
          }
          
          
          
      }
       return true;
       
    }
}