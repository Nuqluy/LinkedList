package intList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

/**
 * Testing for the Integer Linked List class. No tests included for the insert method.
 * See the IntegerLinkedList test document for details of the test ids.
 *
 * @author ahart
 */
class IntegerLinkedListTest {
    /**
     * Covers test ids: 1, 2, 3
     */
    @Test
    public void testAddFirst() {
        IntegerLinkedList myList = new IntegerLinkedList();

        myList.addFirst(3);
        myList.addFirst(2);
        myList.addFirst(1);

        assertEquals(3, myList.getCount());
        assertEquals("1,2,3,", myList.toString());
    }

    /**
     * Covers test ids: 4, 5, 6
     */
    @Test
    public void testAddLast() {
        IntegerLinkedList myList = new IntegerLinkedList();
        myList.addLast(6);
        myList.addLast(7);
        myList.addLast(8);

        assertEquals(3, myList.getCount());
        assertEquals("6,7,8,", myList.toString());
    }

    /**
     * Covers test ids: 7, 8
     */
    @Test
    public void testMultiRemoveFirst() {
        IntegerLinkedList mylist = new IntegerLinkedList();
        int val = 0;
        try {
            mylist.addLast(56);
            mylist.addLast(74);
            mylist.addLast(92);
            val = mylist.removeFirst();
            assertEquals(2, mylist.getCount());
            assertEquals(56, val);

            val = mylist.removeFirst();
            assertEquals(1, mylist.getCount());
            assertEquals(74, val);

            val = mylist.removeFirst();
            assertEquals(0, mylist.getCount());
            assertEquals(92, val);

            assertEquals(true, mylist.isEmpty());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Covers test ids: 9
     */
    @Test
    public void testEmptyRemoveFirst() {
        IntegerLinkedList mylist = new IntegerLinkedList();

        assertThrowsExactly(Exception.class, () ->
        {
            mylist.removeFirst();
        });
    }

    /**
     * Covers test ids: 10, 11
     */
    @Test
    public void testMultiRemoveLast() {
        IntegerLinkedList mylist = new IntegerLinkedList();
        int val = 0;
        try {
            mylist.addLast(56);
            mylist.addLast(74);
            mylist.addLast(92);
            val = mylist.removeLast();
            assertEquals(2, mylist.getCount());
            assertEquals(92, val);

            val = mylist.removeLast();
            assertEquals(1, mylist.getCount());
            assertEquals(74, val);

            val = mylist.removeLast();
            assertEquals(0, mylist.getCount());
            assertEquals(56, val);

            assertEquals(true, mylist.isEmpty());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Covers test ids: 12
     */
    @Test
    public void testEmptyRemoveLast() {
        IntegerLinkedList mylist = new IntegerLinkedList();

        assertThrowsExactly(Exception.class, () ->
        {
            mylist.removeLast();
        });
    }

    /**
     * Covers test ids: 13, 14, 15
     */
    @Test
    public void testDestroy() {
        IntegerLinkedList myList = new IntegerLinkedList();
        myList.destroy();
        assertEquals(0, myList.getCount());
        assertEquals("", myList.toString());

        myList.addLast(6);
        myList.destroy();
        assertEquals(0, myList.getCount());
        assertEquals("", myList.toString());


        myList.addLast(7);
        myList.addLast(8);
        myList.destroy();
        assertEquals(0, myList.getCount());
        assertEquals("", myList.toString());
    }
}