package leetcodesolve.leetcode28;

/**
 * @ClassName ImplementstrStr
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 9:27 AM
 * @Version 1.0
 **/
public class ImplementstrStr {


    /**
        * @Description
        * @Date 9:29 AM 2019/2/3
        * @param:
        * @return:
     *
     * 实现 strStr() 函数。
     *
     * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
     *
     * 示例 1:
     *
     * 输入: haystack = "hello", needle = "ll"
     * 输出: 2
     * 示例 2:
     *
     * 输入: haystack = "aaaaa", needle = "bba"
     * 输出: -1
     * 说明:
    **/

    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) {
                break;
            }
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() -1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int strStr2(String haystack, String needle) {
        if (needle == null && needle.length() == 0) {
            return 0;
        }
        for (int i =0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
