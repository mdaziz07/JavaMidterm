package string.problems;

public class DuplicateWord {

    /* Write a java program to find the duplicate words and their number of occurrences in the string.
       Also Find the average length of the words.
     */

    public static void main(String[] args) {

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language.";
        st = st.toLowerCase();

        String[] myStringArray = st.split(" ");
        //System.out.println(myStringArray.length);

        avgLength(myStringArray);
        findDuplicateWords(myStringArray);

    }
        public static void avgLength(String[] myStringArray) {
            int lengthEachString;
            int totalLength = 0;

            for(int i = 0; i < myStringArray.length; i++) {

                lengthEachString = myStringArray[i].length();
                totalLength = totalLength + lengthEachString;
            }
            //System.out.println(totalLength);

            System.out.println("Average Length of the words is " + (totalLength / myStringArray.length));
        }

        public static void findDuplicateWords(String[] myStringArray){

        int count;
        for (int i= 0; i < myStringArray.length; i++){
            count = 1;
            for(int j = i+1; j < myStringArray.length; j++){
                if(myStringArray[i].equals(myStringArray[j])){
                    count++;
                    myStringArray[j] = "0";
                }
            }
            if (count > 1 && !(myStringArray[i].equals("0"))){
                System.out.println(myStringArray[i] + " count " + count + " Times" );
            }
        }

    }

}
