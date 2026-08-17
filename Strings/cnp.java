import java.util.Scanner;

class Solution {

    public static int solve(String s, int k) {

        int count = 0;
        int ans = 0;

        // WRITE YOUR LOGIC HERE
// nnynn
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='Y'){
                if(count>=k){
                    ans++;
                }

            count=0;
            continue;

        }
        count++;
        if(count>=k){
            ans++;
            count=0;
        }
        
        }
       



        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int k = sc.nextInt();

        System.out.println(solve(s, k));
    }
}