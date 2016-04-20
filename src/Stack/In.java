package Stack;

/**
 * Created by jordan on 4/10/16.
 */
public interface In {

    // create an input stream from standard input
    In In();

    // create an input stream from a file or website
    In In(String name);

    // true if no more input, false otherwise
    boolean isEmpty();

    // read a value of type int
    int readInt();

    double readDouble();

    void close();
}
