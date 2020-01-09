/* What are the values of mystery(2, 25) and mystery(3, 11)? Given positive
 * integers a and b, describe what value mystery(a, b) computes. Answer 
 * the same question, but replace + with * and replace return 0 with return 1.
 */


public class Exc1118 {
    public static int mystery1(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery1(a+a, b/2);
        return mystery1(a+a, b/2) + a;
    }

    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a*a, b/2);
        return mystery2(a*a, b/2) * a;
    }

    public static void main(String[] args) {
        // int a = 1, b = 2;
        System.out.println(mystery1(2, 25) + ", " + mystery2(2, 25));
        System.out.println(mystery1(3, 11) + ", " + mystery2(3, 11));
    }
}