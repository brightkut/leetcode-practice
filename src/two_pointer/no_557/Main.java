package two_pointer.no_557;

public class Main {
    public static void main(String[] args) {
//        Input: s = "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"
        System.out.println(reverseWords("Let's take LeetCode contest"));

//        Input: s = "Mr Ding"
//        Output: "rM gniD"
        System.out.println(reverseWords("Mr Ding"));
    }

    public static String reverseWords(String s) {
        // 1. Split the string by space to new array
        // 2. create function to return reverse string bu using two pointer
        // 3. loop new array and call reverse string and add the result to response string
        // 4. return the response string

        String [] sp = s.split(" ");

        StringBuilder sb = new StringBuilder();
        int c = 0;
        for(String str : sp){
           sb.append(reverseWords2(str));
           if(c < sp.length - 1){
               sb.append(" ");
           }
           c++;
        }

        return sb.toString();
    }

    public static String reverseWords2(String s) {
        char [] c = s.toCharArray();

       int l = 0, r = s.length() - 1;

       while (l < r){
           char temp = c[r];
           c[r] = c[l];
           c[l] = temp;
           l++;
           r--;
       }

       return new String(c);
    }
}

