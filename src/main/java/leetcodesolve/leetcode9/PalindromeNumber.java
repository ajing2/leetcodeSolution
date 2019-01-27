package leetcodesolve.leetcode9;

public class PalindromeNumber {
    /**
     * 最大回文数字
     * 12321
     * 10000    这种情况不考虑
     */


    public boolean isPalindrome(int x) {
        if (x < 0 || x != 0 && x % 10 == 0) {
            return false;
        }
        int palind = x;
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x / 10;
            x /= 10;
        }
        return palind == rev;
    }
}
