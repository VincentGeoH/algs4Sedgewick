/* Binomial distribution. Estimate the number of recursive calls that would be 
 * used by the code
 *      public static double binomial(int N, int k, double p) 
 *      {
 *          if ((N == 0) || (k < 0)) return 1.0;
 *          return (1.0 - p)*binomial(N-1, k) + p*binomial(N-1, k-1); 
 *      }
 */

public class Exc1127 {
    private static int COUNT = 0;

    public static double binomial(int N, int k, double p) {
        COUNT++;
        System.out.println(COUNT);

        if(N == 0 && k == 0) return 1.0;
        if(N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p); 
    }

    public static void main(String[] args) {
        int N = 10;
        int k = 5;
        double p = 0.25;
        double result = binomial(N, k, p);
        
        System.out.println(result);
    }
}