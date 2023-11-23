/**
 * LinkedList - IntegerLinkedList.java
 * @author Charlie Berry
 * @version 1.0
 */

package intList;

public class IntegerLinkedList {


    public IntegerLinkedList() {
        resetLinkedList();
    } // create new linked list

    /**
     * Resets all values in a linked list, ready for integer assignment.
     */
    private void resetLinkedList() { // resets all values to none
        count = 0;
        start = null;
    }

    /**
     * Gives count to the method that is requesting to access it.
     * @return count, the amount of values in the linked list.
     */
    public int getCount() {
        return count;
    }

    /**
     * set the count in the list
     * @param count the amount of values in the linked list
     */
    public void setCount(int count) {
        this.count = count;
    }


    /**
     * gets the start of the linked list
     * @return the start node value in the list
     */
    public Node getStart() {
        return start;
    }

    /**
     * Set the start node value of the linked list
     * @param start the starting value of the linked list
     */
    public void setStart(Node start) {
        this.start = start;
    }

    private int count = 0;


    private Node start = null;


    /**
     * checks to see if the linked list is empty
     * @return true or false depending on size of count, the amount of values in the list.
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Add a value to the start of the linked list
     * @param value the number being added to the start of the list
     */
    public void addFirst(int value) {

        count++;
        // create new node for linked list
        Node newNode = new Node(value);

        // if empty, the start is the new node created, being the first value in the list
        if (isEmpty()) {
            start = newNode;

        } else {
            // something already present in the list, attach to the start
            newNode.next = start;
            start = newNode;
        }
    }

    /**
     * add a number to the end of the linked list
     * @param value the number being added to the end of the list
     */
    public void addLast(int value) {
        Node newNode = new Node(value); // create new node

        // if empty, the start is the new node created, being the first value in the list
        if (isEmpty()) {
            start = newNode;

        } else {
            // something already present in the list, attach to the end
            Node current = start; // find start of the list
            while (current.next != null) { // move through the list until it reaches the end
                current = current.next;
            }
            current.next = newNode; // null value is now assigned a number
        }
        count++;
    }

    /**
     * removes the first value in the list
     * @return return should be null, deleting the select value in the list
     * @throws Exception when the list is empty, there is nothing to remove
     */
    public int removeFirst() throws Exception{

        int value = 0;
        if (isEmpty()) { // check for empty list
            System.out.println("Nothing to remove");
            throw new Exception();
        } else {
            Node currentNode = start; // set a new node to the start of the list
            start = start.next;
            count--;
            return currentNode.value;
        }
    }

    /**
     * removes the last value in the list
     * @return return should be the last in the list, the value to remove
     * @throws Exception when the list is empty, there is nothing to remove
     */
    public int removeLast() throws Exception {
        int value = 0;
        if (isEmpty()) { // list is empty, nothing to remove
            System.out.println("empty");
            throw new Exception();
        } else {
            if (start.next == null) { // if the end is null, set value to the previous value - the last in the list
                value = start.value;
            } else {
                Node nodeCurrent = start.next; // start the current tracked node
                Node previous = start; // start tracking the previous node

                while (nodeCurrent.next != null) {
                    // as long as the next value in nodeCurrent is still within the list
                    // proceed to keep iterating through the list
                    previous = nodeCurrent;
                    nodeCurrent = nodeCurrent.next;
                }
                // this is now the last item in the list, set to null
                previous.next = null;
                value = nodeCurrent.value;
            }
            count--;
        }
        return value;
    }

    public void displayUI() {

        System.out.println("Count: {0} " + count);
        if (count > 0) {
            // output the value in the first node
            System.out.println(start.value + ",");

            // get the next node
            Node nextNode = start.next;

            // start and keeping looping until the next node points to null
            while (nextNode != null) {
                System.out.println(nextNode.value + ",");
                nextNode = nextNode.next;
            }
        }

    }

    /**
     * delete a linked list
     */
    public void destroy() { resetLinkedList(); } // call upon resetLinkedList() to reset a list

    /**
     * toString() method
     * @return a string version of the inserted value
     */
    public String toString()
    {
        String output = "";
        if (!isEmpty())
        {
            output = start.value + ",";

            Node nextNode = start.next;

            //loop until nextNode == null
            while (nextNode != null)
            {
                output = output + nextNode.value + ",";
                nextNode = nextNode.next;
            }
        }
        return output;
    }


    public class Node {
        public int value;
        Node next;
        Node previous;

        public Node(int n) {
            value = n;
            next = null;

        }
    }
}
