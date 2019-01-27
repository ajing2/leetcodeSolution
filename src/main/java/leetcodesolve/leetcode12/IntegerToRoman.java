package leetcodesolve.leetcode12;

public class IntegerToRoman {
    /**
     * 整型化成罗马数字
     * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
     *
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */

    public String intToRoman(int num){
        int[] vales = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < vales.length; i++){
            while (num >= vales[i]) {
                num -= vales[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
}
