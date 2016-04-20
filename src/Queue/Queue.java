package Queue;

/**
 * Created by jordan on 4/10/16.
 */
public interface Queue<Item> {

    Queue Queue(); // create an empty queue

    void enqueue(Item item); // add an item

    Item dequeue(); // remove the least recently added item

    boolean isEmpty(); // is the queue empty

    int size(); // number of items in the queue
}
