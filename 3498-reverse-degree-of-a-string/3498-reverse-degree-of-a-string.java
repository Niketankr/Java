class Solution {
    public int reverseDegree(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            // Normal alphabet position:
            // a = 1, b = 2, ..., z = 26
            int normal = s.charAt(i) - 'a' + 1;

            // Reverse alphabet position:
            // a = 26, b = 25, ..., z = 1
            int reverse = 26 - normal + 1;

            // Position starts from 1
            int position = i + 1;

            sum += position * reverse;
        }

        return sum;
    }
}