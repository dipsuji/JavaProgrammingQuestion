package collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;


/***
 * LinkedList implements the Collection interface.
 * It uses a doubly linked list internally to store the elements.
 * It can store the duplicate elements.
 */
class LinkedListCollection {

    public static void main(String[] args) {
        // create an linkedList of name
        LinkedList<String> linkedList = new LinkedList<String>();
        // Adding name object in linkedList
        linkedList.add("John");
        linkedList.add("Arnav");
        linkedList.add("Dip");
        linkedList.add("Disha");
        System.out.println(linkedList);
        //Traversing in list through Iterator for getting item from list
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}