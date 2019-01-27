package leetcodesolve.leetcode8;

public class StringtoInteger {
    /**
     *  + - not valid
     *  越界问题
     */

    public int myAtoi(String s) {
        if (s == null && s.length() == 0) {
            return 0;
        }
        s = s.trim();
        char firstChar = s.charAt(0);
        int sign = 1;
        int start = 0;
        long res = 0;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }

        for (int i = start; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
//                当不是数字的时候， 我们选择是继续还是停止， 这都可以判断
//                continue;
                return (int)res * sign;
            }
            res = res * 10 + s.charAt(i) - '0';
            if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && res > (Integer.MAX_VALUE - 1) ) {
                return Integer.MIN_VALUE;
            }
        }

        return (int)res * sign;

    }

}
