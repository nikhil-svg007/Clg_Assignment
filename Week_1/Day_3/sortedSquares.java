class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0;
        int right = n - 1;
        int idx = n - 1;
        while (left <= right) {
            int lSq = nums[left] * nums[left];
            int rSq = nums[right] * nums[right];
            if (lSq > rSq) {
                ans[idx] = lSq;
                left++;
            } else {
                ans[idx] = rSq;
                right--;
            }
            idx--;
        }
        return ans;
    }
}