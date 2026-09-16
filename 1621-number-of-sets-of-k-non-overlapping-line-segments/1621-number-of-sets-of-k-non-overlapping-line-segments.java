class Solution {
    public int numberOfSets(int n, int k) {

        long MOD = 1000000007L;

        int a = n + k - 1;
        int b = 2 * k;

        // Calculate C(a, b)
        long result = 1;

        for (int i = 1; i <= b; i++) {
            result = result * (a - b + i) % MOD;
            result = result * modInverse(i, MOD) % MOD;
        }

        return (int) result;
    }

    // Calculate a^b % MOD
    private long power(long a, long b, long MOD) {

        long result = 1;

        while (b > 0) {

            if ((b & 1) == 1) {
                result = result * a % MOD;
            }

            a = a * a % MOD;
            b >>= 1;
        }

        return result;
    }

    // Modular inverse
    private long modInverse(long a, long MOD) {
        return power(a, MOD - 2, MOD);
    }
}