package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by helmeter on 6/13/16.
 */
public class Patent {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        dfs(ans, "", n, 0, 0);
        return ans;
    }

    private void dfs(List<String> ans, String curr, int n, int numl, int numr) {
        if (numl == n && numr == n) {
            ans.add(curr);
            return;
        }
        if (numl < n)
            dfs(ans, curr+'(', n, numl+1, numr);
        if (numr < numl)
            dfs(ans, curr+')', n, numl, numr+1);
    }

    public static void main(String[] args) {
        System.out.println(new Patent().generateParenthesis(3));
    }
}
