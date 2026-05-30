public class facts {

    static int facts(int n){


        if(n==1 || n==0){
            return 1;
        }

        return n*facts(n-1);

    }
    public static void main(String[] args) {

        System.out.print(facts(5));
        

    }
    
}
