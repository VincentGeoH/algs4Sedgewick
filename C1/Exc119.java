public class Exc119 {
    public static void main(String[] args) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
    }
}
