package leetcodesolve.leetcode5;

/**
 * @ClassName LongestPalindromicSubstring
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 1:41 PM
 * @Version 1.0
 **/
public class LongestPalindromicSubstring {

    /**
        * @Description
        * @Date 1:41 PM 2019/1/22
        * @param:
        * @return:
     *
     * Input: "babad"
     * Output: "bab"
     *
     *Note: "aba"  is also a valid answer.
     * Input: "cbbd"
     * Output: "bb"
     *
     *
     *               j = 7
     * c a m n b c m a d
     *   i = 1
    **/

    //方法1:
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String res1 = "";
        boolean[][] dp = new boolean[s.length()][s.length()];
        int max = 0;
        for (int j = 0; j < s.length(); j++)
            for (int i = 0; i <= j; i++) {
//                注意是i + 1 >= j - 1 的这种情况是不可以出现的， 一出现越界这种情况， 直接返回true， 避免走dp[i + 1][j - 1]
//                dp[i][j] = (s.charAt(i) == s.charAt(j)) && ((j - i <= 2) || dp[i + 1][j - 1]);
                if (j == i) {
                    dp[i][j] = true;
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
                }
                System.out.printf("dp[%s][%s] = %s \n", i, j, dp[i][j]);


//                System.out.println("dp " + i + "," + j + "==" + dp[i][j]);
                if (dp[i][j]) {
                    if (j - i + 1 > max) {
                        max = j - i + 1;
                        res1 = s.substring(i, j + 1);
//                        System.out.println("i = " + i + ", j + 1 = " + (j + 1));
                    }
                }
            }
        return res1;
    }

    public static String res = "";
    public static String longestPalindrome2(String s) {
        if (null == s || s.length() == 0) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            helper(s, i, i);
//            helper(s, i, i + 1);
        }
        return res;
    }

    public static void helper(String s, int left, int right) {
        while (left > 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        String cur = "";
        try {
            cur = s.substring(left + 1, right);
        } catch (Exception e) {
            cur = "";
        }
        System.out.println(cur);
        res = cur.length() > res.length() ? cur : res ;

    }

    public static void main(String[] args) {
//        String s = "babad";
//        String s = "camcbxmad";
        String s = "camcbcmad";
        System.out.println(longestPalindrome(s));

    }
}
