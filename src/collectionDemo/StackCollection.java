package collectionDemo;

import java.util.Iterator;
import java.util.Stack;

/**
 * The stack is the subclass of Vector. It implements the last-in-first-out data structure.
 * The stack contains all of the methods of Vector class.
 * Provides its methods like boolean push(), boolean peek(), boolean push(object o).
 */
class StackCollection {
    public static void main(String[] args) {
        // create an stack of name
        Stack<String> stack = new Stack<String>();
        // Adding name object in stack
        stack.push("John");
        stack.push("Arnav");
        stack.push("Dip");
        stack.push("Disha");
        System.out.println(stack);
        // removing element from last index
        stack.pop();
        System.out.println(stack);
        //Traversing in list through Iterator for getting item from list
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}