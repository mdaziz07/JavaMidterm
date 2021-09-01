package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

    static String absolutePath = System.getProperty("user.dir");
    static String relativePath = "/src/data/self-driving-car";
    static final String path = absolutePath + relativePath;
    static FileReader fileReader;
    static BufferedReader bufferedReader;
    ConnectToSqlDB mysqlConnect = new ConnectToSqlDB();
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
        ConnectToSqlDB connect = new ConnectToSqlDB();
        String data = "";
        LinkedList <String> linkedList = new LinkedList<String >();
        Stack<String> stack = new Stack<>();
        String[] line = new String[]{};
        ArrayList<String> arraylist = new ArrayList<>();
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            try {
                while ((data = bufferedReader.readLine()) != null) {
                    System.out.println(data);
                    connect.insertDataFromStringToSqlTable(data,"dataReader","Text");
                    line = data.split(" ");
                    arraylist.addAll(Arrays.asList(line));
                }
                System.out.println("\nDone reading file\n");
                for(String st : arraylist){
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
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("UNABLE TO CLOSE BUFFERED READER");
            }
        }

    }

}
