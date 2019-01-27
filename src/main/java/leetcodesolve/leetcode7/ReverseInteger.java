package leetcodesolve.leetcode7;

public class ReverseInteger {
    /**
     * x = 123   return 321
     * x = -123  return -321
     * int
     * -2147483648 ~ 2147483647      -2**32  ~   2**32 - 1
     * 越界问题
     */
    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int)res;
    }
}
