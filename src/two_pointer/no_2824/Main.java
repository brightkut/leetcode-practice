package two_pointer.no_2824;

import java.util.List;

public class Main {

    public static void main(String[] args) {

       //Input: nums = [-1,1,2,3,1], target = 2
       //Output: 3
        System.out.println(countPairs(List.of(-1,1,2,3,1),2));


       //Input: nums = [-6,2,5,-2,-7,-1,3], target = -2
       //Output: 10
        System.out.println(countPairs(List.of(-6,2,5,-2,-7,-1,3),-2));
    }

    public static int countPairs(List<Integer> nums, int target){
        // 1. we create count var
        // 2. we've iterated the list since the first index until the previous last index
        // 3. we iterate ths current index + 1 until the last index
        // 4. we sum the result inside and compare to target if less than it then we count it
        // 5. return count

        int count = 0;

        for(int i = 0 ; i < nums.size() ; i++){
            for(int j = i+1 ; j < nums.size() ; j++){
                int sum = nums.get(i) + nums.get(j);

                if(sum < target){
                    count++;
                }
            }
        }

        return count;
    }
}
