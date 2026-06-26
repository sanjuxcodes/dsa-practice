public class btod {

    public static void main(String[] a){
        String bin="1010";
        int pow=0;
        int sum=0;;
 
        for(int i=bin.length()-1;i>=0;i--){
            int d = bin.charAt(i)-'0';
            sum+=d*Math.pow(2,pow);
            pow++;
        }
        System.out.print(sum);
    }
    
}
