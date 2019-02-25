package leetcodesolve.leetcode31;

/**
 * @ClassName NextPermutation
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 5:34 PM
 * @Version 1.0
 **/
public class NextPermutation {

    /**
     * @Description
     * @Date 5:34 PM 2019/2/18
     * @param: [nums]
     * @return: void
     * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
     * 1,2,3 → 1,3,2
     * 3,2,1 → 1,2,3
     * 1,1,5 → 1,5,1
     *
     *
     * // 1　　2　　7　　4　　3　　1
     *              ^
     *      // 1　　2　　7　　4　　3　　1
     *                           ^
     *      // 1　　3　　7　　4　　2　　1
     *              ^            ^
     *      // 1　　3　　1　　2　　4　　7
     *                  ^   ^    ^   ^
     *
     *      7 4 3 2 1 1
     *
     *      time : O(n);
     *      space : O(1);
     **/

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int firstSmall = -1;
        for (int i = nums.length -2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                firstSmall = i;
                break;
            }
        }
        if (firstSmall == -1) {
            reverse(nums, 0, nums.length -1);
            return;
        }


    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++,j--);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i++] = nums[j];
        nums[j--] = temp;
    }

}
