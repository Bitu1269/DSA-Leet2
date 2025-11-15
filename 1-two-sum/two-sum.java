class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        // Step 1: Create array of {value, index}
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i;       // index
        }

        // Step 2: Sort by value
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int left = 0, right = n - 1;

        // Step 3: Two pointer search
        while (left < right) {
            int sum = arr[left][0] + arr[right][0];

            if (sum == target) {
                return new int[]{arr[left][1], arr[right][1]};
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{};
    }
}
