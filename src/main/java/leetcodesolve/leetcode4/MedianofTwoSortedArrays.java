package leetcodesolve.leetcode4;

public class MedianofTwoSortedArrays {

    /**
     *           L1   R1
     * num1: 3  5  | 8   9                   cur1: 左边有几个元素
     * num2: 1  2   7 |  10  11  12          cur2: 左边有几个元素
     *              L2   R2
     * num3: 1  2   3   5   7   |   8   9   10  11  12
     *  左右两边的数字要相等
     */

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if  (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int len = nums1.length + nums2.length;
        int cut1 = 0;
        int cut2 = 0;
        int cutL = 0;
        int cutR = nums1.length;

        while (cut1 < nums1.length) {
            cut1 = (cutR - cutL) / 2 + cutL;
            cut2 = len / 2 - cut1;
            double L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            double L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            double R1 = (cut1 == 0) ? Integer.MAX_VALUE : nums1[cut1];
            double R2 = (cut1 == 0) ? Integer.MAX_VALUE : nums2[cut2];
            if (L1 > R2) {
                cutR = cut1 - 1;
            } else if (L2 > R1) {
                cutL = cut1 + 1;
            } else {
                if (len % 2 == 0) {
                    L1 = L1 > L2 ? L1 : L2;
                    R1 = R1 < R2 ? R1 : R2;
                    return (L1 + R1) / 2;
                } else{
                    R1 = (R1 < R2) ? R1 : R2;
                    return R1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3, 5, 8, 9};
        int[] nums2 = new int[]{10, 11, 12};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

}
