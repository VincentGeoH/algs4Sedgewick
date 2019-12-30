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
