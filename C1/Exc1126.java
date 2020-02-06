/* Sorting three numbers. Suppose that the variables a, b, c, and t are all 
 * of the same numeric primitive type. Show that the following code puts 
 * a, b, and c in ascending order:
 *      if (a > b) { t = a; a = b; b = t; } 
 *      if (a > c) { t = a; a = c; c = t; } 
 *      if (b > c) { t = b; b = c; c = t; }
 */

public class Exc1126 {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int t;

        if (a > b) { t = a; a = b; b = t; } 
        if (a > c) { t = a; a = c; c = t; } 
        if (b > c) { t = b; b = c; c = t; }

        System.out.println(a + ", " + b + ", " + c);
    }
}