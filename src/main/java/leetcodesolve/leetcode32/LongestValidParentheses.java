package leetcodesolve.leetcode32;

import java.util.Stack;

/**
 * @ClassName LongestValidParentheses
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 3:55 PM
 * @Version 1.0
 **/
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
       Stack<Integer> stack = new Stack();
       int res = 0;
       int start = -1;
       for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == '(') {
               stack.push(i);
           } else {
               if (stack.isEmpty()) {
                   start = i;
               } else {
                   stack.pop();
                   if (stack.isEmpty()) {
                       res = Math.max(res, i - start);
                   } else {
                       res = Math.max(res, i - stack.peek());
                   }
               }
           }
       }
       return res;
    }

}
