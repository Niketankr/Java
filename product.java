public class ProductArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;

        int[] res = new int[n];

        res[0] = 1;
        for(int i=1;i<n;i++)
            res[i] = res[i-1] * nums[i-1];

        int right = 1;
        for(int i=n-1;i>=0;i--){
            res[i] *= right;
            right *= nums[i];
        }

        for(int x : res)
            System.out.print(x+" ");
    }
}

output:
24 12 8 6 

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        k = k % nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }
}

output:
[5, 6, 7, 1, 2, 3, 4]


import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        List<int[]> res = new ArrayList<>();

        for(int[] interval : intervals){
            if(res.isEmpty() || res.get(res.size()-1)[1] < interval[0]){
                res.add(interval);
            } else {
                res.get(res.size()-1)[1] =
                    Math.max(res.get(res.size()-1)[1], interval[1]);
            }
        }

        for(int[] arr : res)
            System.out.println(arr[0]+" "+arr[1]);
    }
}

output:
1 6
8 10
15 18
