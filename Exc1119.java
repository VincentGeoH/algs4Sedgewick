/* What is the largest value of N for which this program takes less 1 hour 
 * to compute the value of F(N)? Develop a better implementation of F(N) that
 * saves computed values in an array.
 */


import java.math.BigInteger;

public class Exc1119 {
    public static BigInteger[] F(int N) {
        BigInteger[] fib = new BigInteger[N+1];
        fib[0] = new BigInteger("0");
        if (N >= 1) {
            fib[1] = new BigInteger("1");
            for (int i = 2; i <= N; i++)
                fib[i] = fib[i-1].add(fib[i-2]);
        }
        return fib;
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + F(N)[N]);
    }
}