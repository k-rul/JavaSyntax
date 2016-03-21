import java.util.Random;
import java.util.Scanner;

/**
 * Created by Momchil on 19-Mar-16.
 */
public class Problem7_RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int min = (n <= m) ? n : m;
        int max = (n >= m) ? n : m;

        int dif = max - min;

        Random rand = new Random();

        for (int i = 0; i <= dif; i++) {
            System.out.printf("%d ", rand.nextInt((dif) + 1) + min);
        }
    }
}
