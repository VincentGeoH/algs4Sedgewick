/* Binomial distribution. Estimate the number of recursive calls that would be 
 * used by the code
 *      public static double binomial(int N, int k, double p) 
 *      {
 *          if ((N == 0) || (k < 0)) return 1.0;
 *          return (1.0 - p)*binomial(N-1, k) + p*binomial(N-1, k-1); 
 *      }
 * to compute binomial(100, 50). Develop a better implementation that is based on 
 * saving computed values in an array.
 */

public class Exc1127 {
    private static int COUNT = 0;

    public static double Binomial(int N, int k, double p) {
        //COUNT++;
        //System.out.println(COUNT);

        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p) * Binomial(N - 1, k, p) + p * Binomial(N - 1, k - 1, p); 
    }

    public static double Binomial2(int N, int k, double p) {
        //System.out.println("N =  " + N + "; k = " + k + "; p = " + "p");

        double[][] arr = new double[N + 1][k + 1];

        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0; 

        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1.0;
                } else if (i - 1 < 0 || j - 1 < 0) {
                    arr[i][j] = 0.0;
                } else if (i - 1 >= 0 && j - 1 < 0) {
                    arr[i][j] = (1.0 - p) * arr[i - 1][j];
                } else if (i < j) {
                    arr[i][j] = 0.0;
                } else {
                    arr[i][j] = (1.0 - p) * arr[i - 1][j] + p * arr[i - 1][j - 1];
                }
                System.out.println("i = " + i + ", j = " + j + ", arr[i][j] = " + arr[i][j]);
            }
        }
        
        return arr[N][k];
    }

/*     public static double enhancedBinomial(int N, int k, double p) {
        if(N == 0 && k == 0) return 1.0;
        if(N < 0 || k < 0) return 0.0;

        return (1.0 - p) * enhancedBinomial(N - 1, k, p) + p * enhancedBinomial(N - 1, k - 1, p);
    } */

    public static void main(String[] args) {
        int N = 100;
        int k = 50;
        double p = 0.25;
        //double resultByBinomial = Binomial(N, k, p);
        double resultByEnhancedBinomial = Binomial2(N, k, p);
        //Binomial2(N, k, p);
        
        //System.out.println(resultByBinomial);
        System.out.println(resultByEnhancedBinomial);
    }
}