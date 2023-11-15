package intList;

public class Main {

    public static void main(String[] args) {
        IntegerLinkedList linkList = new IntegerLinkedList();
        linkList.addFirst(1);
        linkList.addFirst(5);
        linkList.addFirst(3);
        linkList.addFirst(12);
        linkList.addFirst(3);
        linkList.addFirst(52);
        linkList.addLast(222222);

        linkList.displayUI();
    }

}
