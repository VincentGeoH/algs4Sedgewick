public class Exc1113 {
    public static void main(String[] args) {
        int M = 2, N = 3;
        double[][] b = new double[N][M];
        double a[][] = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                b[j][i] = a[i][j];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
