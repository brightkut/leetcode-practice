package two_pointer.no_2367;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Input: nums = [0,1,4,6,7,10], diff = 3
//        Output: 2
        System.out.println(arithemeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
        System.out.println(arithemeticTriplets2(new int[]{0, 1, 4, 6, 7, 10}, 3));
//        Input: nums = [4,5,6,7,8,9], diff = 2
//        Output: 2
        System.out.println(arithemeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2));
        System.out.println(arithemeticTriplets2(new int[]{0, 1, 4, 6, 7, 10}, 3));
    }

    // Using unorder set O(n)
    public static int arithemeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int count = 0;
        for(int n : nums){
            if(set.contains(n + diff) && set.contains(n + 2 * diff)){
                count++;
            }
        }

        return count;
    }

    // Using binary search O(nlogn)
    public static int arithemeticTriplets2(int[] nums, int diff) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length - 3 ; i++){
            if(binarySearch(nums, nums[i] + diff) && binarySearch(nums, nums[i] + 2 * diff)){
                count++;
            }
        }
        return count;
    }

    public static boolean binarySearch(int[] nums, int target){
        int l = 0;
        int r = nums.length -1;

        while (l<=r){
            int mid = l + (r-l)/2;

            if(nums[mid] == target){
                return true;
            }else if(nums[mid] < target){
                l = mid +1;
            }else {
                r = mid -1;
            }
        }

        return false;
    }
}
