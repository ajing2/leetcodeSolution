package leetcodesolve.leetcode29;

/**
 * @ClassName DivideTwoIntegers
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 10:02 AM
 * @Version 1.0
 **/
public class DivideTwoIntegers {


    /**
        * @Description
        * @Date 10:02 AM 2019/2/3
        * @param:
        * @return:
     *
     * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
     *
     * 返回被除数 dividend 除以除数 divisor 得到的商。
     *
     * 示例 1:
     *
     * 输入: dividend = 10, divisor = 3
     * 输出: 3
     * 示例 2:
     *
     * 输入: dividend = 7, divisor = -3
     * 输出: -2
     *
     *
     * 1. + -
     * 2. 越界
     * 3. ==0
     * 4. 正常
    **/

    public int divide(int dividend, int divisor) {
        int sign = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            sign = -1;
        }
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        if (ldividend < ldivisor || ldividend == 0) {
            return 0;
        }
        long lres = divideLong(ldividend, ldivisor);
        int res = 0;
        if (lres > Integer.MAX_VALUE) {
            res = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            res = (int)(sign * lres);
        }
        return res;

    }

    private long divideLong(long ldividend, long ldivisor) {
        if (ldividend < ldivisor) {
            return 0;
        }
        long sum = ldivisor;
        long multiple = 1;
        while ((sum + sum) <= ldividend) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + divideLong(ldividend - sum, ldivisor);
    }
}
