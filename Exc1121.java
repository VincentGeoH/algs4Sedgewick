import java.util.*;

public class Exc1121 {
    public static void printTable(Scanner sc) {
        int i = 0;
        List<String> name = new ArrayList<String>();
        List<Integer> score1 = new ArrayList<Integer>();
        List<Integer> score2 = new ArrayList<Integer>();
        while (sc.hasNextLine()) {
            name.add(i, sc.next());
            score1.add(i, sc.nextInt());
            score2.add(i, sc.nextInt());
            i++;
        }
        sc.close();
        for (int j = 0; j < i; j++) {
            System.out.printf("\n%8s | %8d | %8d | %8.3f", 
                name.get(j), score1.get(j), score2.get(j), 
                (score1.get(j) * 1.0) / score2.get(j));
        }
    }

    public static void main(String[] args) {
        System.out.println("Pls input a name and two integers each line with blank as delimeter:");
        Scanner sc = new Scanner(System.in);
        printTable(sc);
        System.out.println();
    }
}