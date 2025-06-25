package two_pointer.no_3194;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Input: nums = [7,8,3,4,15,13,4,1]
//        Output: 5.5
        System.out.println(minimumAverage(new int[]{7, 8, 3, 4, 15, 13, 4, 1}));

//        Input: nums = [1,9,8,3,10,5]
//        Output: 5.5
        System.out.println(minimumAverage(new int[]{1,9,8,3,10,5}));

//        Input: nums = [1,2,3,7,8,9]
//        Output: 5.0
        System.out.println(minimumAverage(new int[]{1,2,3,7,8,9}));
    }

    public static double minimumAverage(int[] nums) {
        // 1. Sort the array
        // 2. Use two pointer to calculate average and compare with the value
        // 3. Return the minimum average

        Arrays.sort(nums);

        int l = 0 , r = nums.length - 1;

        double avg = (double) (nums[l] + nums[r]) / 2 ;

        while (l < r) {
            double res = (double) (nums[l] + nums[r]) / 2;

            avg = Math.min(avg, res);

            l++;
            r--;
        }

        return avg;
    }
}