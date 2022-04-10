package data_structures;

import java.util.ArrayList;
import java.util.Iterator;


public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes using the add, peek, remove & retrieve methods.
         * Use For-Each loop and While-loop with Iterator to retrieve data_structures.data.
         *
         * Store and retrieve data_structures.data from/to a database table.
         */

        ArrayList<String> alist = new ArrayList<String>();
        alist.add(0, "samar");
        alist.add(1, "ali");
        alist.add(2, "noor");
        alist.add(3, "osman");
        alist.add(4, "salma");
        alist.add(5, "Ahmed");
        alist.add(6, "Haboub");
        System.out.println(alist);

        alist.remove(2);
        alist.remove(4);
        System.out.println(alist);

        //alist.get(0);

        //for (int i = 0; i < alist.size(); i++) {
          //  System.out.println(alist.get(i));

            Iterator irt = alist.iterator();
            while (irt.hasNext()) {
                System.out.println(irt.next());
            }

        }
    }




      //  for (Iterator<Integer> itr1 = alist.iterator(); itr1.hasNext();){
//            for (Iterator<Integer> itr2 = alist.iterator(); itr2.hasNext();) {
  //              if (itr1.next() < itr2.next()) {
                 //   System.out.println(itr1.next()

