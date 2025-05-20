package two_pointer.no_2000;

public class Main {

    public static void main(String[] args) {
//        Input: word = "abcdefd", ch = "d"
//        Output: "dcbaefd"
        System.out.println(reversePrefix("abcdefd", 'd'));

//        Input: word = "xyxzxe", ch = "z"
//        Output: "zxyxxe"
        System.out.println(reversePrefix("xyxzxe", 'z'));

//        Input: word = "abcd", ch = "z"
//        Output: "abcd"
        System.out.println(reversePrefix("abcd", 'z'));
    }

    public static String reversePrefix(String word, char ch){
        // 1. we start find the first occurrence of ch in word
        // 2. if we find it we get the index of it as right pointer
        // 3. we create a left pointer at the start of the word
        // 4. we use the two pointer for doing the reverse string

        char [] arr =  word.toCharArray();

        boolean found = false;

        int l = 0;

        for(int i = 0 ; i < word.length() ; i++){
            char c = word.charAt(i);

            if(found){
                break;
            }

            if(c == ch) {
                arr[i] = c;
                int r = i ;

                while (l < r){
                    char temp = arr[r];
                    arr[r] = arr[l];
                    arr[l] = temp;

                    l++;
                    r--;
                }

                found = true;
            }

        }

        return new String(arr);
    }
}
