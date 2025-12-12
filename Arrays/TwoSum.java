import java.util.*;

public class TwoSum {

    // LeetCode-style method
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{ map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    // Main for local testing
    public static void main(String[] args) {
        // Example: manual test
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum solver = new TwoSum();
        int[] ans = solver.twoSum(nums, target);

        System.out.println("Indices: " + ans[0] + ", " + ans[1]);

        // ----- OR: read from stdin -----
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int t = sc.nextInt();
        int[] res = new TwoSum().twoSum(arr, t);
        System.out.println(res[0] + " " + res[1]);
        sc.close();
        */
    }
}
