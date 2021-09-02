package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class DataReader {

    static String absolutePath = System.getProperty("user.dir");
    static String relativePath = "/src/data/self-driving-car";
    static final String path = absolutePath + relativePath;
    static FileReader fileReader;
    static BufferedReader bufferedReader;
    ConnectToSqlDB mysqlConnect = new ConnectToSqlDB();


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

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            try {
                int lineNumber = 0;
                while ((data = bufferedReader.readLine()) != null) {
                    if (lineNumber == 0) {
                        lineNumber++;
                        continue;
                    }

                    if (data.isEmpty() || data.trim().equals("") || data.trim().equals("\n")) {
                        continue;
                    } else {
                        System.out.println(data);
                        //connect.insertDataFromStringToSqlTable(data,"dataReader","Text");
                        String[] word = data.split(" ");
                        for (int i = 0; i < word.length; i++) {
                            linkedList.add(word[i]);
                            stack.add(word[i]);
                        }
                    }
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
        //Using For Loop
        System.out.println("\n"+"Printing LinkedList");
        for(String s : linkedList){
            System.out.print(s);
        }
        System.out.println("\n"+"Printing Stack");
        for(String s : stack){
            System.out.print(s);
        }

        //Using While Loop
        System.out.println("\n"+"Printing LinkList using While Loop");
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next());
        }
    }
}
