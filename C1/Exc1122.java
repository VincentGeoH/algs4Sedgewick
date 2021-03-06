/* Write a version of BinarySearch that uses the recursive rank() given on
 *  page 25 and traces the method calls. Each time the recursive method is 
 *  called, print the argument values lo and hi, indented by the depth of 
 *  the recursion. Hint: Add an argument to the recursive method that keeps 
 *  track of the depth.
 */

import java.util.*;
import java.io.*;

public class Exc1122 {
    public static int rank(int key, int[] a) { 
        return rank(key, a, 0, a.length - 1, 1); 
    }
    
    public static int rank(int key, int[] a, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.printf(" ");
        }
        System.out.println("lo: " + lo + " " + "hi: " + hi);

        // Index of key in a[], if present, is not smaller than lo
        // and not larger than hi.
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid]) return rank(key, a, lo, mid - 1, ++depth);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, ++depth);
        else                   return mid;    
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(new File(args[0]));
        Scanner sc = new Scanner(file);
        Scanner stdin = new Scanner(System.in);
        List<Integer> num = new ArrayList<Integer>();

        int i = 0;
        while (sc.hasNextLine()) {
            num.add(i, Integer.parseInt(sc.nextLine()));
            i++;
        }

        int[] whitelist = num.stream().mapToInt(j->j).toArray();
        Arrays.sort(whitelist);

        while (stdin.hasNextInt()) {
            // Read key, print if not in whitelist.
            int key = stdin.nextInt();
            if (rank(key, whitelist) == -1) {
            } else {
                int mid = rank(key, whitelist);
                System.out.println("Index of Key " + key + " is " + mid + ":");
                rank(key, whitelist);
            }
        }
        sc.close();
        stdin.close();
    }
}
