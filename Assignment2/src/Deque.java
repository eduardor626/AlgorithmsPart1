import java.util.Iterator;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import java.lang.*;
import java.util.NoSuchElementException;





public class Deque<Item> implements Iterable<Item> {

    private Deque<Item> deck;

    
    // construct an empty deque
    public Deque() {
        deck = new Deque<Item>();
    }

    // is the deque empty?
    public boolean isEmpty() {
        return deck.size() == 0;
    }
    // return the number of items on the deque
    public int size() {
        int i = 0;
        for (Deque<Item> var : deck)
        {
            i++;
        }
        return i;
    }

    // add the item to the front
    public void addFirst(Item item) {
    }

    // add the item to the back
    public void addLast(Item item) {
    }

    // remove and return the item from the front
    public Item removeFirst() {
    }

    // remove and return the item from the back
    public Item removeLast() {
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {

    }

    // unit testing (required)
    public static void main(String[] args){

    }


}
