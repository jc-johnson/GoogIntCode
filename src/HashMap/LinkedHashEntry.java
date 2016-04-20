package HashMap;

/**
 * Created by jordan on 4/19/16.
 */
public class LinkedHashEntry {

    String key;
    int value;
    LinkedHashEntry next;

    // Constructor
    LinkedHashEntry(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }


}
