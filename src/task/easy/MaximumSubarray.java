package task.easy;

/**
 * @author Sergey Yanushevskiy
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int largestSum = nums[0];
        int tempSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (tempSum + nums[i] > tempSum && (tempSum + nums[i] > nums[i])) {
                tempSum = tempSum + nums[i];
            } else {
                tempSum = nums[i];
            }
            largestSum = tempSum > largestSum
                    ? tempSum
                    : largestSum;
        }
        return largestSum;
    }

}
