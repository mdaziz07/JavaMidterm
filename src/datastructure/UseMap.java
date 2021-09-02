package datastructure;

import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For-Each loop and While-loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */
        List<String > color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("While");
        color.add("Brown");

        List<String> country = new ArrayList<>();
        country.add("USA");
        country.add("UK");
        country.add("UAE");
        country.add("USSR");

        Map<String,List<String>> list = new HashMap<String, List<String>>();
        list.put("Color",color);
        list.put("Country",country);

        System.out.println("Color we have in the Map :" + list.get("Color"));
        System.out.println("Countries we have in the Map: " + list.get("Country"));

    }

}
