class Solution {
    public String compressedString(String word) {



        int comp=1;

        

        StringBuilder sb = new StringBuilder();
        if(word.length()==1){
             sb.append(comp);
                    sb.append(word.charAt(0));
        }

        char ch=word.charAt(word.length()-1);



        for(int i =0;i<word.length()-1;i++){
            
            if(word.charAt(i)==word.charAt(i+1)){
                
                if(comp==9){
                    sb.append(comp);
                    sb.append(word.charAt(i));
                    comp=0;
                
            }

            comp++;
            }
            
            else{
                sb.append(comp);
                    sb.append(word.charAt(i));
                    comp=1;

            }

            if(i==word.length()-2){

                if(word.charAt(i)==ch){
                
                 sb.append(comp);
                    sb.append(word.charAt(i));}
                else{
                     sb.append(1);
                    sb.append(ch);
                }


            }


            
            
        }
        return sb.toString();


        
    }
}