public class rotate {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        rotatee(arr, 3);
        System.err.println(arr);
    }

    static void rotatee(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = n - k; i <= k; i++) {
            arr[n - k] = nums[n - k];
        }
        for (int i = 0; i < n - k - 1; i++) {
            arr[i] = nums[i];
        }
    }
}