package datastructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        Queue<Integer> queue = new PriorityQueue<>();
        for(int i = 10 ; i < 60; i+=10){
            queue.add(i);
        }

        System.out.println("Printing Queue list using For Loop");
        for(int x : queue){
            System.out.println(x);
        }

        System.out.println("Peeking first element from Queue: " + queue.peek());
        System.out.println("Removing the very first element from Queue: " + queue.poll());
        System.out.println("Peeking an element from Queue: " + queue.peek());

        System.out.println("Printing the reaming Queue list using For Loop");
        for(int x : queue){
            System.out.println(x);
        }
    }

}
