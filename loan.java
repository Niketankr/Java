import java.util.Scanner;

class Loan {
    double principal, rate, duration;

    Loan(double p, double r, double d) {
        principal = p;
        rate = r;
        duration = d;
    }

    double calculateMaturity() {
        return principal * (1 + (rate / 100) * duration);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter duration: ");
        double d = sc.nextDouble();

        Loan loan = new Loan(p, r, d);
        System.out.println("Maturity Amount: " + loan.calculateMaturity());
    }
}
output:
Enter principal: 50000
Enter rate: 9.68
Enter duration: 5
Maturity Amount: 74200.0



class MatrixMultiplication {

    static int[][] multiply(int[][] a1, int[][] a2) {
        int r1 = a1.length;
        int c1 = a1[0].length;
        int r2 = a2.length;
        int c2 = a2[0].length;

        // Fail-safe condition
        if (c1 != r2) {
            throw new IllegalArgumentException("Matrix dimensions do not match for multiplication");
        }

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] a1 = {{1, 2}, {3, 4}};
        int[][] a2 = {{5, 6}, {7, 8}};

        int[][] res = multiply(a1, a2);

        for (int[] row : res) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
output:
19 22 
43 50 
