package two_pointer.no_2108;

public class Main {
    public static void main(String[] args) {
//        Input: words = ["abc","car","ada","racecar","cool"]
//        Output: "ada"
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));

//        Input: words = ["notapalindrome","racecar"]
//        Output: "racecar"
        System.out.println(firstPalindrome(new String[]{"notapalindrome","racecar"}));

//        Input: words = ["def","ghi"]
//        Output: ""
        System.out.println(firstPalindrome(new String[]{"def","ghi"}));
    }

    public static String firstPalindrome(String[] words) {
        // 1. loop in words
        // 2. use 2 pointer 2 check if the word is palindrome
        // 3. if it is palindrome return the word
        // 4. if not return empty string

        for(String word : words){
            if(isPalindrome(word)){
                return word;
            }
        }

        return "";
    }

    public static boolean isPalindrome(String word){
        int l = 0, r = word.length() - 1;
        while (l < r){
            if(word.charAt(l) != word.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}
