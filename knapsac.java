public class Main {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int knapsack(int W, int wt[], int val[], int n) {

        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {

                if (i == 0 || w == 0)
                    dp[i][w] = 0;

                else if (wt[i - 1] <= w)
                    dp[i][w] = max(
                            val[i - 1] + dp[i - 1][w - wt[i - 1]],
                            dp[i - 1][w]
                    );

                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {

        int wt[] = {10, 20, 30};
        int val[] = {60, 100, 120};
        int W = 50;
        int n = wt.length;

        System.out.println("Maximum Value = " + knapsack(W, wt, val, n));
    }
}
output:
Maximum Value = 220


import java.util.*;

class Item {
    int value, weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

public class Main {

    static double fractionalKnapsack(int W, Item arr[], int n) {

        // Sort items by value/weight ratio (descending)
        Arrays.sort(arr, (a, b) -> 
            Double.compare((double)b.value / b.weight, (double)a.value / a.weight)
        );

        double totalValue = 0.0;

        for (int i = 0; i < 5; i++) {

            if (arr[i].weight <= W) {
                totalValue += arr[i].value;
                W -= arr[i].weight;
            } else {
                totalValue += arr[i].value * ((double) W / arr[i].weight);
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        Item arr[] = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        int W = 50;

        System.out.println("Maximum Value = " +
                fractionalKnapsack(W, arr, arr.length));
    }
}

output:
Maximum Value = 240.0
