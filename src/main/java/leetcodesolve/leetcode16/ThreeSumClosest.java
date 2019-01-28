package leetcodesolve.leetcode16;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName ThreeSumClosest
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 4:31 PM
 * @Version 1.0
 **/
public class ThreeSumClosest {

    /**
        * @Description
        * @Date 4:31 PM 2019/1/28
        * @param:
        * @return:
     *
     * * For example, given array S = {-1 2 1 -4}, and target = 1.
     *
     *      The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
     *
     *      time : O(n^2);
     *      space : O(1);
    **/

    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                res = Math.abs(sum - target) < Math.abs(res - target) ? sum : res;
            }
        }
        return res;
    }
}
