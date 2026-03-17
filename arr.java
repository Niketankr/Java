import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                System.out.println(map.get(diff)+" "+i);
            }
            map.put(nums[i], i);
        }
    }
}
output:
0 1


public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int max = arr[0], sum = arr[0];

        for(int i=1;i<arr.length;i++){
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
output:
6


public class Stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int min = prices[0], profit = 0;

        for(int i=1;i<prices.length;i++){
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }

        System.out.println(profit);
    }
}
output:
5
