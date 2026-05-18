class Solution {
    public boolean strongPasswordCheckerII(String password) {

        int n=password.length();

        if(n<8){
            return false;

        }
        if(password.charAt(n-1)==password.charAt(n-2)){
                    return false;

                }

        boolean l=false;
         boolean u=false;
          boolean d=false;
           boolean s=false;
            boolean aa=true;
    

        for(int i=0;i<n;i++){
            char ch=password.charAt(i);

            if(Character.isLowerCase(ch)){
                l=true;
                continue;

            }
            if(Character.isUpperCase(ch)){

                u=true;
                continue;

            }
            if(Character.isDigit(ch)){
                d=true;
                continue;
                
            }
            if(!Character.isLetterOrDigit(ch)){
                s=true;
                continue;
            }
           
        }
        int j=0;
         while(j<n-2){
                if(password.charAt(j)==password.charAt(j+1)){
                    aa=false;

                }
                j++;

            }

        if(l && aa & s && d && u){
            return true;
        }
        else
            return false;

        
    }
}