import java.util.Scanner;

class tcsq {
    public static void main(String[] args) {
        System.out.println("bobs: ");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();

        System.out.println("alc: ");
        String a = sc.nextLine();

        int i = b.length() - 1;
        int j = a.length() - 1;

        int skipb = 0;
        int skipa = 0;

        while (i >= 0 || j >= 0) {

            // Process Bob string
            while (i >= 0) {
                if (b.charAt(i) == '#') {
                    skipb++;
                    i--;
                } else if (skipb > 0) {
                    skipb--;
                    i--;
                } else {
                    break; // valid character found
                }
            }

            // Process Alice string
            while (j >= 0) {
                if (a.charAt(j) == '#') {
                    skipa++;
                    j--;
                } else if (skipa > 0) {
                    skipa--;
                    j--;
                } else {
                    break; // valid character found
                }
            }

            // Compare characters
            if (i >= 0 && j >= 0) {
                if (b.charAt(i) != a.charAt(j)) {
                    System.out.println("NO");
                    return;
                }
            } else {
                // One string finished, other didn't
                if (i >= 0 || j >= 0) {
                    System.out.println("NO");
                    return;
                }
            }

            // Move both pointers
            i--;
            j--;
        }

        System.out.println("YES");
    }
}