class Q1 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            largest = Math.max(largest, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return largest;
    }
}