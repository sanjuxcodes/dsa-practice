public class strr {
    public static void main(String[] args){
        String ip="mamam";
        String vow="aieou";

        int vc=0;
        int cc=0;


        //for(int i =0;i<ip.length();i++){

        for(char c: ip.toCharArray()){

        if(vow.indexOf(c) != -1){
            vc++;

        }else{
            cc++;
        }


   
    }
    System.out.print(vc);
    System.out.print(cc);

    //}
    }
    
}
