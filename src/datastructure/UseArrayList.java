package datastructure;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
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
        System.out.println(list.get(1));
        System.out.println(list.remove(3));
        try {
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException ex){
            System.out.println("You just deleted USSR from your list");
        }

        for(String st : list){

            System.out.println(st);

        }

        while(!list.isEmpty()){
            for(int i = 0; true; i++){
                //infinite loop?
                System.out.println(list.get(i));
                break;
            }
            System.out.println("your list is empty");
            }



    }

}
