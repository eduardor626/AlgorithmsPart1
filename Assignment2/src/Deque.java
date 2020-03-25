import java.util.Iterator;
import java.util.NoSuchElementException;


public class Deque<Item> implements Iterable<Item> {

    //Create a Node with next,prev pointers and data
    private class Node{
        Node next;
        Node prev;
        Item item;
    }


    private Node head = new Node(), tail = new Node();
    private int size = 0;


    // construct an empty deque
    public Deque() {

    }

    // is the deque empty?
    public boolean isEmpty() {
        return size == 0;
    }

    // return the number of items on the deque
    public int size() {
        return size;
    }

    // add the item to the front
    public void addFirst(Item item) {
        if(item == null){
            throw new IllegalArgumentException();
        }
        Node newItem = new Node();
        newItem.item = item;
        if (!isEmpty()) {
            newItem.next = head;
            head.prev = newItem;
            head = newItem;
        } else {
            head = newItem;
            tail = head;
        }
        size++;
    }

    // add the item to the back
    public void addLast(Item item) {
        if(item == null){
            throw new IllegalArgumentException();
        }
        Node newItem = new Node();
        newItem.item = item;
        if (!isEmpty()) {
            newItem.prev = tail;
            tail.next = newItem;
            tail = newItem;
        } else {
            head = newItem;
            tail = head;
        }
        size++;
    }

    // remove and return the item from the front
    public Item removeFirst() {
        Item thisItem;
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        thisItem = head.item;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        size--;

        return thisItem;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Item thisItem = tail.item;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return thisItem;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }

        @Override
        public Item next() {
            if( !hasNext() ){
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
            }
        }

    public static void main(String[] args){
    }


}
