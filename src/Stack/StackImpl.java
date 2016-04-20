/*
package Stack;

*/
/**
 * Created by jordan on 4/10/16.
 *//*


class StackImpl<Item> implements Stack, Iterable<Item> {

    private String[] a; // Stack entries
    private int N; // size


    public Stack Stack(){
     Stack stack = new StackImpl<Item>();
     return stack;
    }

    public Item pop(){
        Item item;
        // item = new Item();
        // return item;
    }

    public boolean isEmpty(){
        return false;
    }

    public int size(){
        return 0;
    }

    // Move stack of size N <= max to a new array of size max.
    public int resize(int max){
        // Item[] temp = (Item[]) new Object()[max];

        Item[] a = new Item[max];

        for (int i = 0; i < max; i++) {
            temp[i] = a[i];
        }
        a = temp;

        return 0;
    }

    // add item to the top of the stack - array implementation
    public void push(Item item) {

        // check if array is too small
        // is stack size N equal to the array of size a.length
        // if no room - double array size
        */
/*if (N == a.length) resize(2*a.length){
            a[N++] = item;
        }*//*

    }

    // remove item from the top of the stack
    public Item pop() {
        //Item item = a[--N];
        a[N] = null; // Avoid loitering
        if (N > 0 && N == a.length/4)
            resize(a.length/2);
        return item;
    }

    // simple stack client
    public void printReverse(Stack<Item> stack) {
        while (!StdIn.readInt());
            stack.push(StdIn.readInt());

        for (int i : stack)
            StdOut.println(i);
    }


    public static void main(String[] args) {
        Stack<String> stack = new StackImpl<String>();

        // for (String s : stack)
            
    }
}
*/
