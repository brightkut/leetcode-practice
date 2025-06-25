package two_pointer.no_832;

public class Main {
    public static void main(String[] args) {
//        Input: image = [[1,1,0],[1,0,1],[0,0,0]]
//        Output: [[1,0,0],[0,1,0],[1,1,1]]
        System.out.println(flipAndInvertImage(new int[][]{{1,1,0},{1,0,1},{0,0,0}}));

//        Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//        Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[
        System.out.println(flipAndInvertImage(new int[][]{{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}}));
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for(int i = 0 ; i < image.length ; i++){
            reverseArray(image[i]);
            invertArray(image[i]);
        }
        return image;
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void invertArray(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
    }
}
