package two_pointer.no_1768;

public class Main {
    public static void main(String[] args) {
//        Input: word1 = "abc", word2 = "pqr"
//        Output: "apbqcr"
        System.out.println(mergeAlternately("abc", "pqr"));

//        Input: word1 = "ab", word2 = "pqrs"
//        Output: "apbqrs"
        System.out.println(mergeAlternately("ab", "pqrs"));

//        Input: word1 = "abcd", word2 = "pq"
//        Output: "apbqcd"
        System.out.println(mergeAlternately("abcd", "pq"));

    }

    public static String mergeAlternately(String word1, String word2) {
        // 1. case word1 is empty then return word2
        // 2. case word2 is empty then return word1
        // 3. create two pointer first pointer point to the first index of word1
        // second pointer point to the first index of word2
        // 4. loop until the first pointer is less than the length of word1 or
        // the second pointer is less than the length of word2
        // 5. In the loop we have if condition if the first pointer is more than equal word1 length
        // add character index right pointer in string response update right pointer
        // 6. else if the second pointer is more than equal word2 length add character index left pointer in string response
        // update left pointer
        // 7. else add character index left pointer in string response and right pointer in string response and update left and right pointer
        // 8. return response

        if(word1.isEmpty()){
            return word2;
        }

        if(word2.isEmpty()){
            return word1;
        }

        int l = 0;
        int r = 0;
        String res = "";

        while (l < word1.length() || r < word2.length()){
            if(l >= word1.length()){
                res += word2.charAt(r);
                r++;
            } else if (r >= word2.length()){
                res += word1.charAt(l);
                l++;
            } else {
                res += word1.charAt(l);
                res += word2.charAt(r);
                l++;
                r++;
            }
        }

        return res;
    }
}
