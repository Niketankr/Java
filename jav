import java.util.*;

public class DynamicProgrammingPrograms {

    // 1. Fibonacci using DP
    static int fib(int n, int dp[]) {
        if (n <= 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
    }

    // 2. 0/1 Knapsack
    static void knapsack() {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int W = 7;

        int n = wt.length;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {

                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(
                            val[i - 1] + dp[i - 1][w - wt[i - 1]],
                            dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        System.out.println("Knapsack Maximum Value: " + dp[n][W]);
    }

    // 3. Longest Common Subsequence
    static void lcs() {
        String s1 = "ABCBDAB";
        String s2 = "BDCAB";

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println("LCS Length: " + dp[m][n]);
    }

    // 4. Longest Increasing Subsequence
    static void lis() {
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};

        int n = arr.length;
        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (arr[i] > arr[j] && dp[i] < dp[j] + 1)
                    dp[i] = dp[j] + 1;
            }
        }

        int max = 0;

        for (int x : dp)
            max = Math.max(max, x);

        System.out.println("LIS Length: " + max);
    }

    // 5. Coin Change
    static void coinChange() {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {

                if (coin <= i)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        if (dp[amount] > amount)
            System.out.println("Coin Change Not Possible");
        else
            System.out.println("Minimum Coins: " + dp[amount]);
    }

    // 6. Matrix Chain Multiplication
    static void mcm() {
        int arr[] = {1, 2, 3, 4};

        int n = arr.length;

        int dp[][] = new int[n][n];

        for (int len = 2; len < n; len++) {

            for (int i = 1; i < n - len + 1; i++) {

                int j = i + len - 1;

                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {

                    int q = dp[i][k]
                            + dp[k + 1][j]
                            + arr[i - 1] * arr[k] * arr[j];

                    if (q < dp[i][j])
                        dp[i][j] = q;
                }
            }
        }

        System.out.println("Minimum Multiplications: " + dp[1][n - 1]);
    }

    // 7. Edit Distance
    static void editDistance() {
        String s1 = "sunday";
        String s2 = "saturday";

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0)
                    dp[i][j] = j;

                else if (j == 0)
                    dp[i][j] = i;

                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                else
                    dp[i][j] = 1 + Math.min(
                            dp[i - 1][j - 1],
                            Math.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }

        System.out.println("Edit Distance: " + dp[m][n]);
    }

    // 8. Rod Cutting
    static void rodCutting() {
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};

        int n = 8;

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {

            int max = Integer.MIN_VALUE;

            for (int j = 0; j < i; j++) {
                max = Math.max(max,
                        price[j] + dp[i - j - 1]);
            }

            dp[i] = max;
        }

        System.out.println("Maximum Profit: " + dp[n]);
    }

    // 9. Minimum Path Sum
    static void minPathSum() {
        int[][] grid = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];

        for (int i = 1; i < m; i++)
            dp[i][0] = dp[i - 1][0] + grid[i][0];

        for (int j = 1; j < n; j++)
            dp[0][j] = dp[0][j - 1] + grid[0][j];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                dp[i][j] = Math.min(dp[i - 1][j],
                        dp[i][j - 1]) + grid[i][j];
            }
        }

        System.out.println("Minimum Path Sum: " + dp[m - 1][n - 1]);
    }

    // 10. Subset Sum
    static void subsetSum() {
        int[] arr = {3, 34, 4, 12, 5, 2};

        int sum = 9;

        int n = arr.length;

        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++)
            dp[i][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                if (arr[i - 1] > j)
                    dp[i][j] = dp[i - 1][j];

                else
                    dp[i][j] = dp[i - 1][j]
                            || dp[i - 1][j - arr[i - 1]];
            }
        }

        System.out.println("Subset Exists: " + dp[n][sum]);
    }

    public static void main(String[] args) {

        // Fibonacci
        int n = 10;
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        System.out.println("Fibonacci: " + fib(n, dp));

        // Knapsack
        knapsack();

        // LCS
        lcs();

        // LIS
        lis();

        // Coin Change
        coinChange();

        // Matrix Chain Multiplication
        mcm();

        // Edit Distance
        editDistance();

        // Rod Cutting
        rodCutting();

        // Minimum Path Sum
        minPathSum();

        // Subset Sum
        subsetSum();
    }
}
output:
Fibonacci: 55
Knapsack Maximum Value: 9
LCS Length: 4
LIS Length: 5
Minimum Coins: 3
Minimum Multiplications: 18
Edit Distance: 3
Maximum Profit: 22
Minimum Path Sum: 7
Subset Exists: true
