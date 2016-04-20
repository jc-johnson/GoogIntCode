package LinkedList;

/**
 * Created by jordan on 4/18/16.
 */
public class Node {

    // reference to the next node in the chain
    Node next;

    // data carried by this node could be of any type you need
    Object data;

    // Node constructor
    public Node(Object dataValue) {
        next = null;
        data = dataValue;
    }

    // these methods should be self-explanatory
    public Object getData() {
        return data;
    }

    @SuppressWarnings("unused")
    public void setData(Object dataValue) {
        data = dataValue;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node nextValue) {
        next = nextValue;
    }

}
