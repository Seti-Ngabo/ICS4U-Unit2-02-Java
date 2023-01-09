/**
 * This is the Satck class.
 *
 * @author  Seti Ngabo
 * @version 1.0
 * @since   2020-10-4
 */

import java.util.ArrayList;

public class SetiStack {
    /**
     * The number of revolutions of the peddles per minute.
    */
    private ArrayList<Integer> stackAsList = new ArrayList<Integer>();

    /**
     * The push() function.
     *
     * @param pushedNumber an element is implemented in an array
    */
    public void push(final int pushedNumber) {
        stackAsList.add(pushedNumber);
    }

    /**
     * The pop() function.
     *
     * @return extract the last element
    */
    public int pop() {
        return stackAsList.remove(stackAsList.size() - 1);
    }

    /**
     * The stackArray() function.
    */
    public void stackArray() {
        System.out.println(stackAsList);
    }
}

