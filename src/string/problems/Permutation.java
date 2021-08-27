package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
        Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".

        Write Java program to compute all permutations of any given String
         */
        String str = "cab";
        StringBuffer strBuf = new StringBuffer(str);
        doPermutation(strBuf,0);

    }

    private static void doPermutation(StringBuffer str, int index){

        if(index == str.length())
            System.out.println(str);
        else {
            doPermutation(str, index+1);
            for (int i = index+1; i < str.length(); i++) {
                swap(str,index, i);
                doPermutation(str, index+1);
                swap(str,i, index);//restore back my string buffer
            }
        }
    }
    private  static void swap(StringBuffer str, int pos1, int pos2){
        char t1 = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, t1);
    }
}
