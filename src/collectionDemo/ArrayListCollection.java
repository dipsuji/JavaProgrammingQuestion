package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The ArrayList class implements the List interface.
 * It uses a dynamic array to store the duplicate element of different data types.
 * The elements stored in the ArrayList class can be randomly accessed.
 * Ordered list
 */

class ArrayListCollection {

    public static void main(String[] args) {
        // create an array list of name
        ArrayList<String> list = new ArrayList<String>();
        //Adding name object in arrayList
        list.add("John");
        list.add("Arnav");
        list.add("Alex");
        System.out.println(list);
        //Traversing in list through Iterator for getting item from list
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}