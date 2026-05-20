public class tcsprime {
    static double   formula(int f,int d){
        double s=Math.ceil(d*.005);
        return s;
    }

    static void getfare(String src ,String dst){
               int Path[] = {800, 600, 750, 900, 1400, 1200, 1100, 1500};

        String[] busStops = {"TH","GA","IC","HA","TE","LU","NI","CA"};
        src=src.toUpperCase();
        dst=dst.toUpperCase();

        if(src.equals(dst)){
            System.out.println("Invalid");
            return;
        }

        float f=0;
        int d=0;
        int idx=-1;
        int di=-1;
        for(int i=0;i<busStops.length;i++){
            if(src.toUpperCase().equals(busStops[i])){
                idx=i;

            }
            
            if(dst.toUpperCase().equals(busStops[i])){
                di=i;
            }
            }

            if(idx <0 || di<0){
                System.out.println("invalid");
                return;
            }


        while(idx != di){
            d+=Path[idx];
            idx++;
            idx=idx%busStops.length;





            

        }
      

        System.out.print(formula(5,d));



      

    }
    public static void main(String[] args) {
        
       getfare("th","Ic");
    }
    
}
