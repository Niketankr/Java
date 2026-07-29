class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] candidates, int target, int index,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {

            // Skip duplicate elements
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // No need to continue if current number is too large
            if (candidates[i] > target) {
                break;
            }

            current.add(candidates[i]);

            // Move to the next index (each element used once)
            backtrack(candidates, target - candidates[i], i + 1, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}