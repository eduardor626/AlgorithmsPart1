import java.util.Iterator;
import edu.princeton.cs.algs4.StdRandom;
import java.lang.*;
import java.util.NoSuchElementException;


public class RandomizedQueue<Item> implements Iterable<Item> {

    int N = 0;
    private Item[] a = (Item[]) new Object[10];


    // construct an empty randomized queue
    public RandomizedQueue(){

    }

    // is the randomized queue empty?
    public boolean isEmpty(){
        return N == 0;
    }

    // return the number of items on the randomized queue
    public int size(){
        return N;
    }

    private void resize(int max)
    { // Move stack to a new array of size max.
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < N; i++){
            temp[i] = a[i];
        }
        a = temp;
    }

    // add the item
    public void enqueue(Item item){
        if(item == null){
            throw  new IllegalArgumentException();
        }
        if(a.length == N){
            resize(a.length*2);
        }
        a[N++] = item;
    }

    // remove and return a random item
    public Item dequeue(){
        if( N == 0 ){
            throw new NoSuchElementException();
        }
        int index = StdRandom.uniform(0,N);
        Item item = a[index];
        swap(index,N - 1);
        a[--N] = null;

        if(N>0 && N==a.length/4){
            resize(a.length/2);
        }
        return item;
    }

    private void swap(int x,int y){
        Item temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    // return a random item (but do not remove it)
    public Item sample(){
        if( N== 0 ){
            throw new NoSuchElementException();
        }
        int index = StdRandom.uniform(0,N);
        return a[index];
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item> { // Support LIFO iteration.
        private int i = N;
        private Item[] b = (Item[]) new Object[N];
        private ReverseArrayIterator(){
          for(int i = 0; i < N; i++){
              b[i] = a[i];
          }
          StdRandom.shuffle(b);
        }
        public boolean hasNext() { return i > 0; }
        public Item next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return a[--i];
        }
        public void remove() {
            new UnsupportedOperationException();
        }
    }

    // unit testing (required)
    public static void main(String[] args){


    }

}
