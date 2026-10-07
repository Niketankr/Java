import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        backtrack(ans, "", 0, 0, n);

        return ans;
    }

    private void backtrack(List<String> ans, String current,
                            int open, int close, int n) {

        // A valid combination is complete
        if (current.length() == 2 * n) {
            ans.add(current);
            return;
        }

        // We can add '(' if we haven't used all n
        if (open < n) {
            backtrack(ans, current + "(", open + 1, close, n);
        }

        // We can add ')' only if there is an unmatched '('
        if (close < open) {
            backtrack(ans, current + ")", open, close + 1, n);
        }
    }
}
