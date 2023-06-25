package recycle;


import java.util.*;
class GFG {
    public static void main (String[] args) {
        LinkedHashMap<Integer, String> lhmap
                = new LinkedHashMap<Integer, String>();

        // add mappings
        lhmap.put(10, "Geeks");
        lhmap.put(15, "4");
        lhmap.put(20, "Geeks");
        lhmap.put(25, "Welcomes");
        lhmap.put(30, "You");

        // convert values to a list
        List<String> listValues = List.copyOf(lhmap.values());


        // print values
        System.out.println("List contains:");
        for (String value : listValues) {
            System.out.println(value);
        }
    }
}
