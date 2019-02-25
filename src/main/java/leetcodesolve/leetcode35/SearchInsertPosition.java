package leetcodesolve.leetcode35;

import java.util.Collection;

/**
 * @ClassName SearchInsertPosition
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 4:57 PM
 * @Version 1.0
 **/
public class SearchInsertPosition {


    /**
     * 35. Search Insert Position
     * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

     You may assume no duplicates in the array.

     Here are few examples.
     [1,3,5,6], 5 → 2
     [1,3,5,6], 2 → 1
     [1,3,5,6], 7 → 4
     [1,3,5,6], 0 → 0

     __target___target

     time : O(logn);
     space : O(1);
     * @param nums
     * @param target
     * @return
     */


    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
