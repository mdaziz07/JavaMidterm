package string.problems;

import java.util.Arrays;

public class Anagram {

    /*
    Write a Java Program to check if two Strings are Anagrams.
        Two String are called Anagrams when both Strings use the same characters but in different order.
        Example: "CAT" and "ACT", "ARMY" and "MARY", "FART" and "RAFT"
    */

    public static void main(String[] args) {

        Anagram obj1 = new Anagram();
        obj1.findAnagram("Keep", "PEEK");

    }

    public void findAnagram(String string1, String string2) {

        boolean isAnagram = true;

        if (string1.length() != string2.length()) {
            System.out.println("Strings are not Anagram");
        } else {

            char[] myCharArray1 = string1.toLowerCase().toCharArray();
            char[] myCharArray2 = string2.toLowerCase().toCharArray();

            Arrays.sort(myCharArray1);
            Arrays.sort(myCharArray2);

            isAnagram = Arrays.equals(myCharArray1, myCharArray2);

            if (isAnagram) {
                System.out.println("Strings: "+ string1+ " & " + string2 + " are Anagram");
            } else {
                System.out.println("Strings: "+ string1+ " & " + string2 + " are not Anagram");
            }
        }
    }
}
