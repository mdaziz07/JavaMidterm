package string.problems;

public class UnitTestingStringProblem {

    public static void main(String[] args) {
        // Unit testing for all classes within this package should be implemented here
        //Unit testing for Anagram class.
        Anagram obj1 = new Anagram();
        obj1.findAnagram("Flow","Wolf");
        obj1.findAnagram("Bear","bare");
        obj1.findAnagram("Spots","Sports");

        //Unit testing for Palindrome
        String string = "Color";
        int length = string.length();
        char [] reverseWord = Palindrome.reverseString(string);
        for (int i = 0; i < length; i++) {
            System.out.print(reverseWord[i]);
        }


    }
}
