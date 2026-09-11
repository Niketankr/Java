class Solution {
    public int totalNumbers(int[] digits) {

        int count = 0;

        // Frequency of each digit
        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        // Hundreds digit: 1 to 9
        for (int i = 1; i <= 9; i++) {

            if (freq[i] == 0) {
                continue;
            }

            freq[i]--;

            // Tens digit: 0 to 9
            for (int j = 0; j <= 9; j++) {

                if (freq[j] == 0) {
                    continue;
                }

                freq[j]--;

                // Units digit must be even
                for (int k = 0; k <= 9; k++) {

                    if (k % 2 == 0 && freq[k] > 0) {
                        count++;
                    }
                }

                freq[j]++;
            }

            freq[i]++;
        }

        return count;
    }
}