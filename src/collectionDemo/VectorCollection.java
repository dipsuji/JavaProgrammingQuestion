package collectionDemo;

import java.util.Iterator;
import java.util.Vector;

/**
 * Vector is similar with ArrayList, but it is synchronized. ArrayList is a better choice if your program is thread-safe.
 * Vector and ArrayList require more space as more elements are added.
 * Vector each time doubles its array size, while ArrayList grow 50% of its size each time
 * Vector uses a dynamic array to store the data elements.
 * It is similar to ArrayList.
 * contains many methods that are not the part of Collection framework.
 */
class VectorCollection {
    public static void main(String[] args) {
        // create an linkedList of name
        Vector<String> vector = new Vector<String>();
        // Adding name object in linkedList
        vector.add("John");
        vector.add("Arnav");
        vector.add("Dip");
        vector.add("Disha");
        System.out.println(vector);
        //Traversing in list through Iterator for getting item from list
        Iterator<String> itr = vector.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}