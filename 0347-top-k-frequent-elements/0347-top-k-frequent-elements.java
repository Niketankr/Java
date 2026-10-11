 import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency of each element
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Min heap based on frequency
        PriorityQueue<Integer> minHeap =
            new PriorityQueue<>((a, b) ->
                freq.get(a) - freq.get(b));

        // Maintain only k most frequent elements
        for (int num : freq.keySet()) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Store the k most frequent elements
        int[] ans = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            ans[i] = minHeap.poll();
        }

        return ans;
    }
}