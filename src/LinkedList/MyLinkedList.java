package LinkedList;

/**
 * Created by jordan on 4/18/16.
 */
public class MyLinkedList {

    // reference to the head node.
    private Node head;
    private static int listCount;

    // LinkedList constructor
    public MyLinkedList() {
        // this is an empty list, so the reference to the head node
        // is set to a new node with no data
        head = new Node(null);
        listCount = 0;
    }

    public void add(Object data) {
        // appends the specified element to the end of the list
        Node temp = new Node(data);
        Node current = head;

        // starting at the head node, crawl to the end of the list
        while(current.getNext() != null) {
            current = current.getNext();
        }
        // the last node's "next" reference set to our new node
        current.setNext(temp);
        listCount++; // increment the number of elements variable
    }

    private static int getCounter() {
        return listCount;
    }

    private static void incrementCounter() {
        listCount++;
    }

    private static void decrementCounter() {
        listCount--;
    }

    // insert specified object at the specified location
    private void add(Object data, int index) {
        Node temp = new Node(data);
        Node current = head;

        // check for null pointer error before iterating
        if (current != null) {
            // stop at index-1 or the end of the list whichever comes first
            for (int i = 0; i < index && current.next != null; i++) {
                current = current.getNext(); // why getNext vs next?
            }
        }

        temp.setNext(current.getNext());
        current.setNext(temp);
        incrementCounter();
    }

    // returns element at specified position in the list
    private Object get(int index) {

        Node current = new Node(null);

        // index must be 1 or higher
        if (index <= 0)
            return null;

        if (head != null) {
            current = head;
            for (int i = 0; i <= index && current!= null; i++) {
                current = current.getNext();
            }
            return current.data;
        }
        return current;
    }

    // removes element in specified position
    private boolean remove(int index) {

        // if index is out of range, exit
        if (index < 0 || index > listCount)
            return false;

        if (head != null) {

            Node current = head;
            Node temp = null;

            // main case
            for (int i = 0; i < index && current != null; i++) {
                if (current.getNext() == null) {
                    return false;
                }

                current.setNext(current.getNext().getNext());
                decrementCounter();
                return true;
            }
        }
    }

    // returns size of list
    private int size() {
        return getCounter();
    }

    public String toString() {
        String output = "";


        if (head != null) {
            Node current = head;

            while(current != null) {
                output += "[" + current.getData().toString() + "]";
                current = current.getNext();
            }
        }
        return output;
    }
}
