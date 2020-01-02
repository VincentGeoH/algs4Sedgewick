// Compute ln(N!)

import java.lang.Math;

public class Exc1120 {
    public static double ln(int N) {
        if (N < 0) return -1;
        if (N == 0) return 0;
        return ln(N-1) + Math.log(N);
    }

    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + ln(N));
    }
}