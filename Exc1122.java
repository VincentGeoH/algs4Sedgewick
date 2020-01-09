/* Write a version of BinarySearch that uses the recursive rank() given on
 *  page 25 and traces the method calls. Each time the recursive method is 
 *  called, print the argument values lo and hi, indented by the depth of 
 *  the recursion. Hint: Add an argument to the recursive method that keeps 
 *  track of the depth.
 */


import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        // Array must be sorted.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                   return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            // Read key, print if not in whitelist.
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1)
                StdOut.println(key);
        }
    }
}


public static int rank(int key, int[] a) { 
    return rank(key, a, 0, a.length - 1); 
}

public static int rank(int key, int[] a, int lo, int hi) {
    // Index of key in a[], if present, is not smaller than lo
    // and not larger than hi.
    if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
    if      (key < a[mid]) return rank(key, a, lo, mid - 1);
    else if (key > a[mid]) return rank(key, a, mid + 1, hi);
    else                   return mid;    
}