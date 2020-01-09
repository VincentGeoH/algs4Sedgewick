/* Write a static method lg() that takes an int value N as argument and returns
 * the largest int not larger than the base-2 logarithm of N. Do not use Math.
 */

 public class Exc1114 {
    private Exc1114() { }

    public static int lg(int N) {
        int i = 0;
        while (N > 1) {
            N /= 2;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(lg(N));
    }
}
