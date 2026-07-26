class Solution {
    public boolean isIsomorphic(String s, String t) {


    //here chcking for isomorphism letter by letter

    // have check two ways thats why 2 hashmaps
    

    
    HashMap<Character, Character> map1 = new HashMap<>();
    HashMap<Character, Character> map2 = new HashMap<>();
    

    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        char ch1= t.charAt(i);

        if(map1.containsKey(ch)){
            if(map1.get(ch) != ch1){
                return false;
            }
        }

        map1.put(ch,ch1);

        if(map2.containsKey(ch1)){
            if(map2.get(ch1) != ch){
                return false;
            }
        }

        map2.put(ch1,ch);
        
        
        
        



    }






return true;
        
    }
}