/* Add to the BinarySearch test client the ability to respond to a second
 * argument: + to print numbers from standard input that are not in the whitelist,
 * - to print numbers that are in the whitelist.
 */

import java.util.*;
import java.io.*;

public class Exc1123 {
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

        System.out.println("'+' or '-'?");
        Scanner in = new Scanner(System.in);
        String arg2 = in.nextLine();

        while (stdin.hasNextInt()) {
            // Read key, print if not in whitelist.
            int key = stdin.nextInt();
            if (rank(key, whitelist) == -1 && arg2 == "-") {
                System.out.println(key);
            } else if (rank(key, whitelist) != -1 && arg2 == "+") {
                key = rank(key, whitelist);
                System.out.println(key);
            } 
        }
        sc.close();
        stdin.close();
        in.close();
    }
}

