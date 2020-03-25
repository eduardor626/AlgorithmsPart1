import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Permutation {

    //driver
    public static void main(String[] args){
        //get the amount of random outputs the client wants displayed
        int K = Integer.parseInt(args[0]);

        //init
        RandomizedQueue<String> queue = new RandomizedQueue<>();

        //put into the queue the items from the file
        while(!StdIn.isEmpty())queue.enqueue(StdIn.readString());

        //print according to K
        for(int i = 0;i<K;++i)
            StdOut.println(queue.dequeue());
    }
}

