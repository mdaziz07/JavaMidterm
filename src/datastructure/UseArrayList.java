package datastructure;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        List<String> list = new ArrayList<>();
        list.add("USA");
        list.add("UK");
        list.add("UAE");
        list.add("USSR");

        //Using For Loop to print ArrayList
        System.out.println("The ArrayList using For Loop is:");
        for(String st : list){
            System.out.println(st);
        }

        //Using While Loop to print ArrayList
        System.out.println("The ArrayList using While Loop is:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Get an element from ArrayLst: " + list.get(1));
        System.out.println("Remove an element form ArrayList: " + list.remove(3));

        try {
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException ex){
            System.out.println("You are trying to get an element which you just deleted");
        }
    }
}
