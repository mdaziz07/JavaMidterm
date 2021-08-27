package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below
         Should return "10 biological"
         */
        String s = "Human brain is a biological learning machine";
        findLongestWord(s);
        //Map<Integer, String> wordNLength = findTheLargestWord(s);
        //System.out.println(wordNLength.get(5));

    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] newStr = wordGiven.split(" ");
        String st = "";

        for(int i = 0; i < newStr.length; i++ ){
            map.put(i+1, newStr[i]);
        }
        //for(int j = 1; j<= map.size(); j++){
            //for(int k = j+1; k <= map.size(); k++ ){
                //st = map.get(j);
               // if(st.length()>1){}

           // }

        // Implement here

        return map;
    }
    public static void findLongestWord(String s){
        String[] newStr = s.split(" ");
        String longestWord = "";
        //for(int i = 0; i < newStr.length; i++){
            for(int j = 0; j < newStr.length; j++){
                if (newStr[j].length() >= longestWord.length()){
                     longestWord = newStr[j];
                }
                System.out.println(longestWord.length()+ " " + longestWord);
            }
        //}

    }
}
