import java.util.*;




class slv{
    public static boolean isSquareFree(int n){

        for(int i=2; i*i<=n; i++){
    
            if(n % (i*i) == 0){
                return false;
            }
        }
    
        return true;
    }
    public static void main(String[] args) {
        int n=20;

        ArrayList<Integer> ls = new ArrayList<>();

        for(int i=2;i<=n;i++){
            if(n%i==0){
                ls.add(i);
            }
        }
        int c=0;
        for (int i =0;  i <ls.size() ; i++){

            if(isSquareFree(ls.get(i))){
                c++;
                

            }

            
        }
        System.out.println(c);
        
            
        }
    }
