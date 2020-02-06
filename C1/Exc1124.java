import java.util.Scanner;

/* Give the sequence of values of p and q that are computed when Euclid’s 
 * algorithm is used to compute the greatest common divisor of 105 and 24. 
 * Extend the code given on page 4 to develop a program Euclid that takes 
 * two integers from the command line and computes their greatest common 
 * divisor, printing out the two arguments for each call on the recursive 
 * method. Use your program to compute the greatest common divisor or 
 * 1111111 and 1234567.
 */


public class Exc1124 {
    public static int Euclid(int p, int q) {
        if (p == 0 || q == 0) {
            return 1;
        }
        if (p < q) {
            int t = q;
            q = p;
            p = t;
        }
        if (p % q == 0) {
            return q;
        } else {
            return Euclid(p, p % q);
        }
    }

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int gcd = Euclid(p, q);
        
        System.out.println("Result: " + gcd);
    }
}