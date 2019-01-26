package leetcodesolve.leetcode1;

import java.util.HashMap;

/**
 * @ClassName TwoSum
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 1:14 PM
 * @Version 1.0
 **/
public class TwoSum {

    /**
     * @param nums
     * @param target
     * @return
     * time: O(n)
     * space: (n)
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null && nums.length < 2) {
            return new int[]{-1, -1};
        }
        int[] res = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            map.put(nums[i], i);
        }

        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i : res) {
            System.out.println(i);
        }
    }
}


