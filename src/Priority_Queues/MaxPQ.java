package Priority_Queues;

/**
 * Created by jordan on 4/10/16.
 */
public interface MaxPQ<Key extends Comparable<Key>> {


    MaxPQ MAX_PQ(); // Create a priority queue

    MaxPQ MaxPQ(int max); // create a priority queue of initial capacity max

    MaxPQ MAX_PQ(Key[] a); // create a priority queue from the keys in a[]

    void insert(Key v); // insert a key into priority queue

    Key max(); // return the largest key

    Key delMax(); // return and remove the largest key

    boolean isEmpty(); // is the priority queue empty?

    int size(); // number of keys in the priority queue
}
