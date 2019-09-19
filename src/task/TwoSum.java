package task;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author Sergey Yanushevskiy
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i < nums.length; i++) {
            for (int j=1; j < nums.length; j++) {
                if (i !=j && (nums[i] + nums[j]) == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] result = new TwoSum().twoSumHash(new int[]{1,2,3,5}, 7);
        Arrays.stream(result).forEach(System.out::println);
    }
    public int[] twoSumHash(int[] nums, int target) {
        int[] returnArray = new int[2];
        for (int i=0; i < nums.length; i++) {
            for (int j=1; j < nums.length; j++) {
                if (i !=j && (nums[i] + nums[j]) == target) {
                    returnArray[0] = i;
                    returnArray[1] = j;
                    return returnArray;
                }
            }
        }
        return null;
    }
}
