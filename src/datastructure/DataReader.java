package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

    static String absolutePath = System.getProperty("user.dir");
    static String relativePath = "/src/data/self-driving-car";
    static final String path = absolutePath + relativePath;
    static FileReader fileReader;
    static BufferedReader bufferedReader;
    //static LinkedList linkedList = new LinkedList<String >();
    //static Stack stack = new Stack();


    public static void main(String[] args) {
        /*
         * Create an API to read the below textFile and print it to the console.
         *      HINT: Use BufferedReader class
         * Use try-catch block to handle Exceptions
         *
         * Store and retrieve the file to/from a database table.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack using push, peek, search & pop methods.
         * Use For-Each & While-loop with Iterator to retrieve data.
         */

        String data = "";
        LinkedList <String> linkedList = new LinkedList<String >();
        Stack<String> stack = new Stack<>();
        String[] line = new String[]{};
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            try {
                while ((data = bufferedReader.readLine()) != null) {
                    System.out.println(data);
                    line = data.split(" ");

                }
                System.out.println("\nDone reading file\n");
                for(String st : line){
                    System.out.print(st);
                }

            } catch (Exception e1) {
                System.out.println("UNABLE TO READ LINE");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND AT " + path);

        } catch (Exception ex) {
            System.out.println("UNABLE TO OPEN BUFFERED READER ON FILE AT PATH: " + path);

        } finally {
            try {
                //assert bufferedReader != null;
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("UNABLE TO CLOSE BUFFERED READER");
            }
        }

    }

}
