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


public class Kadane {

    static int maxSubArray(int arr[]) {

        int maxSoFar = arr[0];
        int currMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }

        return maxSoFar;
    }

    public static void main(String args[]) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("Max Sum = " + maxSubArray(arr));
    }
}

output:
Max Sum = 6

public class ClimbingStairs {

    static int climb(int n) {

        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }

    public static void main(String args[]) {

        System.out.println(climb(5));
    }
}

output:
8
