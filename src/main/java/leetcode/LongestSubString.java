package leetcode;

/**
 * Created by helmeter on 6/11/16.
 */
public class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        int res = 0, left = 0;
        int prev[] = new int[300];

        // init prev array
        for (int i = 0; i < 300; ++i)
            prev[i] = -1;

        for (int i = 0; i < s.length(); ++i) {
            if (prev[s.charAt(i)] >= left)
                left = prev[s.charAt(i)] + 1;
            prev[s.charAt(i)] = i;
            if (res < i - left + 1)
                res = i - left + 1;
        }
        return res;
    }

    public static void main(String[] args) {

        LongestSubString s = new LongestSubString();
        System.out.println(s.lengthOfLongestSubstring("abca"));
    }

}
