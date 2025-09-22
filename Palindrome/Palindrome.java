public class Palindrome {
    public static Boolean isPalindrome(String str) {

        StringBuilder reversed = new StringBuilder(str.toLowerCase()).reverse();
        return  (str==null) ?false: str.toLowerCase().equals(reversed.toString());
    }
}
