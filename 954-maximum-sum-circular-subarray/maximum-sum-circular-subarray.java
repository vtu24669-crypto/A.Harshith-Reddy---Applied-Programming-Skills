class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int linearSum = Fn(nums);

        int globalSum = 0;
        for(int i = 0; i < nums.length; i++) {
            globalSum += nums[i];
            nums[i] *= -1;
        }

        int circularSum = globalSum + Fn(nums);
        if(circularSum == 0) {
            return linearSum;
        }

        return Math.max(linearSum, circularSum);
    }

    public int Fn(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            max = Math.max(max, sum);

            if(sum < 0) {
                sum = 0;
            }
        }

        return max;
    }
}