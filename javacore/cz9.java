public class cz9 {

    static boolean isprm(int n){

        for(int i =2;i*i<=n;i++){
            if(n%i ==0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        int a =20;
        int b=15;
        if(a>=b){
            System.out.print("inva;lid");

        }
        for(int i =a;i<=b;i++){
            if(isprm(i)){
                System.out.println(i);
            }

        }

    }
}
