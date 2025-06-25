package two_pointer.no_2570;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
//        Output: [[1,6],[2,3],[3,2],[4,6]]
        mergeArrays(new int[][]{{1,2},{2,3},{4,5}}, new int[][]{{1,4},{3,2},{4,1}});

//        Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
//        Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
        mergeArrays(new int[][]{{2,4},{3,6},{5,5}}, new int[][]{{1,3},{4,3}});
    }

    public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> arr = new ArrayList<>();

        int l = 0;
        int r = 0;

        while(l < nums1.length || r < nums2.length){
            if(l >= nums1.length){
                arr.add(List.of(nums2[r][0], nums2[r][1]));
                r++;
            }else if(r >= nums2.length){
                arr.add(List.of(nums1[l][0], nums1[l][1]));
                l++;
            }
            else if(nums1[l][0] == nums2[r][0]){
                arr.add(List.of(nums1[l][0], nums1[l][1] + nums2[r][1]));
                l++;
                r++;
            }else {
                if (nums1[l][0] > nums2[r][0]) {
                    arr.add(List.of(nums2[r][0], nums2[r][1]));
                    r++;
                }else {
                    arr.add(List.of(nums1[l][0], nums1[l][1]));
                    l++;
                }
            }
        }

        int[][] res = new int[arr.size()][arr.get(0).size()];
        for(int i = 0; i < arr.size(); i++){
            res[i] = arr.get(i).stream().mapToInt(Integer::intValue).toArray();
        }
        return res;
    }
}
