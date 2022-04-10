package data_structures;

import java.util.HashMap;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and some data_structures.data is inserted into it.
         Retrieve the Collection view of the values present in map
         */

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        //set keys = hm.keySet();
        //Iterator i = keys.iterator();
        //while (i.hasNext()) {
           // System.out.println(i.next());


       // collection getValues = hm.values();
        //i = getValues.iterator();
        //while (i.hasNext()){
          //  System.out.println(i.next());



        System.out.println("Initial Mapping are : " + map);
        System.out.println("collection view is :" + map.values());

    }

}
