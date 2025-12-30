class fristlastoccur {

    static int lowerbound(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n - 1;
        int ans = n;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    static int upperbound(int[] nums, int target) {
        int n = nums.length;
        int l = 0, h = n - 1;
        int ans = n;

        while (l <= h) {
            int mid = l + (h - l) / 2;

            if (nums[mid] > target) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerbound(nums, target);

        if (lb == n || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        int ub = upperbound(nums, target);
        return new int[]{lb, ub - 1};
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 8, 8, 8, 11, 13};
        int f[] = searchRange(arr, 8);

        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);
        }
    }
}
