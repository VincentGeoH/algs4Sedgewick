import java.util.Arrays;

public class Exc1115 {
    private Exc1115() { }

    public static int[] histogram(int[] a, int M) {
        int[] hist = new int[M];
        for (int i = 0; i < M; i++) {
            hist[i] = 0;
            for (int j = 0; j < a.length; j++)
                if (a[j] == i) hist[i]++;
        }
        return hist;
    }

    public static void main(String[] args) {
        int[] a = {2, 2, 7, 9, 8, 3, 4, 7, 0, 2, 1};
        int M = 10;
        System.out.println(Arrays.toString(histogram(a, M)));
    }
}