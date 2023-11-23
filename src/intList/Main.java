/**
 * LinkedList - Main.java
 * @author Charlie Berry
 * @version 1.0
 */

package intList;

public class Main {

    public static void main(String[] args) {
        IntegerLinkedList linkList = new IntegerLinkedList(); // create new linked list

        // assign values to the linked list
        linkList.addLast(222222);
        linkList.addFirst(1);
        linkList.addFirst(5);
        linkList.addFirst(3);
        linkList.addFirst(12);
        linkList.addFirst(3);
        linkList.addFirst(52);

        System.out.println("BEFORE REMOVAL");
        linkList.displayUI(); // display linked list

        try {
            // remove values from the linked list
            linkList.removeFirst();
            linkList.removeLast();

            System.out.println("\nAFTER REMOVAL");
            linkList.displayUI(); // display linked list

            linkList.destroy(); // delete the linked list
            System.out.println("\nDESTROY LIST");
            linkList.displayUI(); // show that the linked list is now empty
        } catch (Exception e) {
            throw new RuntimeException(e); // display error, code should not reach here.
        }
    }

}
