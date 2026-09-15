class Solution {
    public double findMaxAverage(int[] nums, int k) {

        // Prefix sum
        for (int i = 1; i < nums.length; i++)
            nums[i] = nums[i] + nums[i - 1];

        int st = 0;
        int end = k - 1;

        double avg = 0;
        double max_avg = -Double.MAX_VALUE;

        while (end < nums.length) {

            if (st == 0)
                avg = (double) nums[end] / k;
            else
                avg = (double) (nums[end] - nums[st - 1]) / k;

            if (avg > max_avg)
                max_avg = avg;

            st++;
            end++;
        }

        return max_avg;
    }
}