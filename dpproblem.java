import java.util.*;

public class LIS {

    static int lis(int arr[]) {

        int n = arr.length;
        int dp[] = new int[n];

        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1)
                    dp[i] = dp[j] + 1;

        int max = 0;
        for (int i = 0; i < n; i++)
            if (max < dp[i])
                max = dp[i];

        return max;
    }

    public static void main(String args[]) {

        int arr[] = {10, 9, 2, 5, 3, 7, 101, 18};

        System.out.println("Length of LIS = " + lis(arr));
    }
}
output:

Length of LIS = 4
public class LCS {

    static int lcs(String X, String Y, int m, int n) {

        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {

                if (i == 0 || j == 0)
                    dp[i][j] = 0;

                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m][n];
    }

    public static void main(String args[]) {

        String X = "abcde";
        String Y = "ace";

        System.out.println("LCS length = " + lcs(X, Y, X.length(), Y.length()));
    }
}
output:
PS C:\Users\HP\java> javac lcs.java
PS C:\Users\HP\java> java lcs.java 
LCS length = 3

public class CoinChange {

    static int coin(int coins[], int amount) {

        int dp[] = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins)
            for (int i = coin; i <= amount; i++)
                dp[i] += dp[i - coin];

        return dp[amount];
    }

    public static void main(String args[]) {

        int coins[] = {1, 2, 5};
        int amount = 5;

        System.out.println("Ways = " + coin(coins, amount));
    }
}

output:
Ways = 4

import java.util.*;

public class MinCoins {

    static int minCoins(int coins[], int amount) {

        int dp[] = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {

                if (coin <= i)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String args[]) {

        int coins[] = {1, 2, 5};
        int amount = 11;

        System.out.println("Minimum coins = " + minCoins(coins, amount));
    }
}
output:
Minimum coins = 3


public class EditDistance {

    static int editDist(String str1, String str2) {

        int m = str1.length();
        int n = str2.length();

        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {

            for (int j = 0; j <= n; j++) {

                if (i == 0)
                    dp[i][j] = j;

                else if (j == 0)
                    dp[i][j] = i;

                else if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],
                            Math.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }

        return dp[m][n];
    }

    public static void main(String args[]) {

        System.out.println(editDist("sunday", "saturday"));
    }
}

output: 
3
