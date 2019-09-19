package task;

import java.util.Arrays;
import java.util.HashMap;
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
        HashMap<Integer, Integer> map = new HashMap();
        for (int i=0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i=0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            if (map.get(requiredNumber) != null) {
                int secondIndex = map.get(requiredNumber);
                if (secondIndex != i) {
                    return new int[] {i, secondIndex};
                }
            }
        }
        return null;
    }
    public int[] twoSumHashOneGo(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i=0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            if (map.get(requiredNumber) != null) {
                int firstIndex = map.get(requiredNumber);
                return new int[] {firstIndex, i};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No result found");
    }
}
