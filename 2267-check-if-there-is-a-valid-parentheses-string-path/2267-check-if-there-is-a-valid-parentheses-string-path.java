class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Odd length can never form a valid parentheses string
        if ((m + n - 1) % 2 == 1) {
            return false;
        }

        // balance can never exceed the number of cells
        Boolean[][][] memo = new Boolean[m][n][m + n];

        return dfs(grid, 0, 0, 0, memo);
    }

    private boolean dfs(char[][] grid, int r, int c, int balance,
                        Boolean[][][] memo) {

        int m = grid.length;
        int n = grid[0].length;

        if (r >= m || c >= n) {
            return false;
        }

        // Update balance
        if (grid[r][c] == '(') {
            balance++;
        } else {
            balance--;
        }

        // More closing brackets than opening brackets
        if (balance < 0) {
            return false;
        }

        // Not enough cells left to close all open brackets
        int remaining = (m - 1 - r) + (n - 1 - c);
        if (balance > remaining) {
            return false;
        }

        // Reached destination
        if (r == m - 1 && c == n - 1) {
            return balance == 0;
        }

        if (memo[r][c][balance] != null) {
            return memo[r][c][balance];
        }

        boolean result =
            dfs(grid, r + 1, c, balance, memo) ||
            dfs(grid, r, c + 1, balance, memo);

        memo[r][c][balance] = result;
        return result;
    }
}