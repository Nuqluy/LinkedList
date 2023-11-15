package intList;

public class IntegerLinkedList {


    public IntegerLinkedList() {
        resetLinkedList();
    }
    private void resetLinkedList() { count = 0; start = null; }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    private int count = 0;


    private Node start = null;

    public boolean isEmpty() {
        return count == 0;
    }

    public void addFirst(int value) {

        count++;

        // create new node for linked list
        Node newNode = new Node(value);

        // if empty start new node
        if (isEmpty()) {
            start = newNode;

        } else {
            // something already present
            newNode.next = start;
            start = newNode;
        }
    }

    public void addLast(int value) {
        count++;


        Node newNode = new Node(value);

        // if empty start new node
        if (isEmpty()) {
            start = newNode;

        } else {
            // something present
            Node current = start;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void RemoveFirst() {
        count--;

        if (isEmpty()) {
            System.out.println("Nothing to remove");
        } else {
            start = start.next;
        }
    }

    public int removeLast() throws Exception {
        int value = 0;
        if (start == null) {
            throw new Exception("empty");
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


    public void destroy() {
        resetLinkedList();
    }


    private static class Node {
        public int value;
        Node next;

        public Node(int n) {
            value = n;
            next = null;

        }
    }
}
