package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

        boolean isPalindrome = isPalindrome("Civic");
        System.out.println(isPalindrome);
    }

    public static char[] reverseString(String text) {

        char[] textArray = text.toLowerCase().toCharArray();
        int length = textArray.length;
        char[] reversedArray = new char[length];

        for (int i = length - 1; i >= 0; i--) {
            reversedArray[(length - 1) - i] = textArray[i];
        }

        return reversedArray;
    }

    public static boolean isPalindrome(String word) {
        char[] normalArray = word.toLowerCase().toCharArray();
        char[] reversedArray = reverseString(word);

        int length = normalArray.length;

        for (int i = 0; i < length; i++) {
            if (normalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

}

