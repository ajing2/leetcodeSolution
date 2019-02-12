package leetcodesolve.leetcode30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName SubstringwithConcatenationofAllWords
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 9:29 AM
 * @Version 1.0
 **/
public class SubstringwithConcatenationofAllWords {

    /**
        * @Description
        * @Date 9:29 AM 2019/2/11
        * @param:
        * @return:
     *给定一个字符串 s 和一些长度相同的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
     *
     * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
     *
     *
     *
     * 示例 1：
     *
     * 输入：
     *   s = "barfoothefoobarman",
     *   words = ["foo","bar"]
     * 输出：[0,9]
     * 解释：
     * 从索引 0 和 9 开始的子串分别是 "barfoor" 和 "foobar" 。
     * 输出的顺序不重要, [9,0] 也是有效答案。
     * 示例 2：
     *
     * 输入：
     *   s = "wordgoodgoodgoodbestword",
     *   words = ["word","good","best","word"]
     * 输出：[]
     *
    **/

    public List<Integer> findSubstring(String s, String[] words) {
        if (s == null || words == null) {
            return new ArrayList<>();
        }

        List<Integer> res = new ArrayList<>();
        int n = words.length;
        int m = words[0].length();
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : words) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (int i = 0; i <= s.length() - n * m; i++) {
            HashMap<String, Integer> copy = new HashMap<>(map);
            int k = n;
            int j = i;
            while (k > 0) {
                String str = s.substring(j, j + m);
                if (!copy.containsKey(str) || copy.get(str) < 1) {
                    break;
                }
                copy.put(str, copy.get(str) - 1);
                k--;
                j += m;
            }
            if (k == 0) {
                res.add(i);
            }

        }
        return res;

    }
}
