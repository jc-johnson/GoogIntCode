package Stack;

/**
 * Created by jordan on 4/10/16.
 */
public interface Stack<Item> {

    Stack Stack(); // create and empty stack

    void push(Item item); // add an item

    Item pop(); // remove the most recently added item

    boolean isEmpty(); // remove the ost recently added item

    int size(); // number of items in the stack
}
