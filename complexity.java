Time complexity:
import java.util.*;

public class time {

    // O(1)
    public static void constantTime() {
        System.out.println("O(1) - Constant Time");
    }

    // O(log n)
    public static void logTime(int n) {
        System.out.println("O(log n)");
        while (n > 1) {
            n = n / 2;
        }
    }

    // O(sqrt n)
    public static void rootTime(int n) {
        System.out.println("O(sqrt n)");
        for (int i = 1; i * i <= n; i++) {
        }
    }

    // O(n)
    public static void linearTime(int n) {
        System.out.println("O(n)");
        for (int i = 0; i < n; i++) {
        }
    }

    // O(n log n)
    public static void nLogNTime(int n) {
        System.out.println("O(n log n)");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
            }
        }
    }

    // O(n^2)
    public static void quadraticTime(int n) {
        System.out.println("O(n^2)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            }
        }
    }

    // O(n^3)
    public static void cubicTime(int n) {
        System.out.println("O(n^3)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                }
            }
        }
    }

    // O(n!)
    public static void factorialTime(int n) {
        System.out.println("O(n!)");

        if (n == 0)
            return;

        for (int i = 0; i < n; i++) {
            factorialTime(n - 1);
        }
    }

    // O(n^n)
    public static void nPowerNTime(int n) {
        System.out.println("O(n^n)");

        if (n == 0)
            return;

        for (int i = 0; i < n; i++) {
            nPowerNTime(n - 1);
        }
    }

    public static void main(String[] args) {

        int n = 5; 

        constantTime();
        logTime(n);
        rootTime(n);
        linearTime(n);
        nLogNTime(n);
        quadraticTime(n);
        cubicTime(3);       
         factorialTime(4);    
        nPowerNTime(3);      

        System.out.println("All complexities executed.");
    }
}


output:

O(n^n)
O(n^n)
O(n^n)
O(n^n)
O(n^n)
O(n^n)
O(n^n)
O(n^n)
O(n^n)
O(n^n)
All complexities executed.
