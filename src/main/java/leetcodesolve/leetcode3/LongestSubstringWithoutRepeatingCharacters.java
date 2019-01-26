package leetcodesolve.leetcode3;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @ClassName LongestSubstringWithoutRepeatingCharacters
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 4:04 PM
 * @Version 1.0
 **/
public class LongestSubstringWithoutRepeatingCharacters {

    /**
        * @Description
        * @Date 4:04 PM 2019/1/21
        * "abcabcbb"       最大不重复长度是3
        * "bbbbb"          最大不重复长度是1
        * "pwwkew"         最大不重复长度为3
    **/

    // HashMap的做法
    public static int lengthOfLongesSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer>map = new HashMap<>();
        int res = 0;
        for (int i = 0, j = 0; i < s.length(); i ++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            res = Math.max(res, i - j + 1);
        }
        return res;

    }


    //HashSet的做法, 并不适用所有的字符串, 只适用于重复字符串是第一个字符的字符串
    //

    public static int lengthOfLongesSubstring2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int res = 0;

        for (int i = 0, j = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j++));
            } else {
                set.add(s.charAt(i));
                res = Math.max(res, set.size());
            }
        }
        return res;
    }


    public static void main(String[] args) {
        String s = "abcddcbdaefgbcbb";
        System.out.println(lengthOfLongesSubstring(s));
        System.out.println(lengthOfLongesSubstring2(s));
    }

}
