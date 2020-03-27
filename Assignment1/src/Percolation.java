import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private int top = 0,bottom;
    private WeightedQuickUnionUF union;
    private boolean grid[];
    private int size;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n){
        if(n <= 0){
            throw new IllegalArgumentException();
        }
        size = (n*n)+2;
        grid = new boolean[size];
        union = new WeightedQuickUnionUF(size);
        bottom = size;
        //blocking all sites
        for(int i = 0 ; i < 1 ; i++) {
            for(int j = 0; j < size ; j++){
                if(j<n){
                    union.union(top,j);
                }
            }
        }

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col){
        if(row-1 < 1 || row-1 > size)
            throw new IllegalArgumentException();
        if(col-1 < 1 || col-1 > size){
            throw new IllegalArgumentException();
        }


    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col){
        if(row < 1 || row > size)
            throw new IllegalArgumentException();
        if(col < 1 || col > size){
            throw new IllegalArgumentException();
        }

    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col){

    }

    // returns the number of open sites
    public int numberOfOpenSites(){

    }

    // does the system percolate?
    public boolean percolates(){

    }

    // test client (optional)
    public static void main(String[] args){

    }
}
