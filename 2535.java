class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0, digitSum = 0;
        for (int n : nums) {
            sum += n;
            int x = n;
            while (x > 0) {
                digitSum += x % 10;
                x /= 10;
            }
        }
        return Math.abs(sum - digitSum);
    }
}
