/* Write a code fragment that prints the contents of a two-dimensional boolean
 * array, using * to represent true and a space to represent false. Include 
 * row and column numbers.
 */

public class Exc1112 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
}
