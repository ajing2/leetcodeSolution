package leetcodesolve.leetcode17;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LetterCombinationsofaPhoneNumber
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 5:03 PM
 * @Version 1.0
 **/
public class LetterCombinationsofaPhoneNumber {

    private String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits != null && digits.length() != 0) {
            return res;
        }

        return res;
    }


    public List<String> letterCombinations2(String digits){
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        res.add("");
        for (int i = 0; i < digits.length(); i++) {
            int num = digits.charAt(i) - '0';
            while
        }
        return res;
    }

}
