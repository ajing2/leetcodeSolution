package leetcodesolve.leetcode22;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenerateParentheses
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 9:55 AM
 * @Version 1.0
 **/
public class GenerateParentheses {

    /**
        * @Description
        * @Date 9:55 AM 2019/1/30
        * @param:
        * @return:
     *
     * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
     *
     * 例如，给出 n = 3，生成结果为：
     *
     * [
     *   "((()))",
     *   "(()())",
     *   "(())()",
     *   "()(())",
     *   "()()()"
     * ]
    **/

    public static List<String> gennerateParenthesis(int n) {

        List<String> res = new ArrayList<String>();
        if (n == 0) {
            return res;
        }
        helper(res, "", n, n);
        return res;
    }

    public static void helper(List<String> res, String s, int left, int right) {
//        左括号一定要比右括号先出现, left>right的情况都是不符合条件的
        if (left > right) {
            return;
        }
//        最终left和right都必须为0, 才是符合条件的
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }
//        利用两个双指针,
        if (left > 0) {
            helper(res, s + "(", left -1, right);
        }
        if (right > 0) {
            helper(res, s + ")", left, right - 1);
        }

    }


}
