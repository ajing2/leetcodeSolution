package leetcodesolve.leetcode27;

import java.util.Arrays;

/**
 * @ClassName RemoveElement
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 5:17 PM
 * @Version 1.0
 **/
public class RemoveElement {


    /**
        * @Description
        * @Date 5:18 PM 2019/2/2
        * @param:
        * @return:
     *
     *
    case : [3,2,2,3] 3
    2,2
    r
    i
    res : [2,2]
    **/

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[res++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return res;
    }
}
