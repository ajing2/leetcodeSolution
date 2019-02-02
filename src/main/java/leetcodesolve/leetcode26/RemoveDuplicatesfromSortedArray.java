package leetcodesolve.leetcode26;

/**
 * @ClassName RemoveDuplicatesfromSortedArray
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 5:09 PM
 * @Version 1.0
 **/
public class RemoveDuplicatesfromSortedArray {
        
    /**
        * @Description  
        * @Date 5:10 PM 2019/2/2
        * @param:
        * @return:
     *case : [1,1,2,2,3,4,5,6]
     *              1,2,3,4,5,6
     *                  c
     *                      i
     *      result : [1,2,3,4,5,6]
     *
     *      time : O(n);
     *      space : O(1);
     *
    **/


    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
