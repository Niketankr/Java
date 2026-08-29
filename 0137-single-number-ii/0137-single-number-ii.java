class Solution {
    public int singleNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < 32; i++) {

            int count = 0;

            for (int num : nums) {
                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }

            // Keep the bit that appears 1 time modulo 3
            if (count % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}