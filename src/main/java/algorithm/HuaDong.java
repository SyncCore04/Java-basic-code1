package algorithm;

import java.util.Arrays;

public class HuaDong {
    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);
        int left = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (last[c] >= left) {
                left = last[c] + 1;
            }
            last[c] = r;
            max = Math.max(max, r - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        String[] testCases = {
            "abcabcbb",
            "bbbbb",
            "pwwkew",
            "",
            " ",
            "au",
            "dvdf"
        };

        System.out.println("滑动窗口算法 - 无重复字符的最长子串");
        System.out.println("=".repeat(50));

        for (String s : testCases) {
            int result = lengthOfLongestSubstring(s);
            System.out.println("输入: \"" + s + "\"");
            System.out.println("输出: " + result);
            System.out.println("-".repeat(50));
        }
    }
}