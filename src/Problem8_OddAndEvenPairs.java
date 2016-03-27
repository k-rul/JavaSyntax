import java.util.Scanner;

public class Problem8_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");

        if (input.length % 2 != 0) {
            System.out.println("Invalid length");
            return;
        }
        for (int i = 0; i < input.length; i = i + 2) {
            compare(input[i], input[i + 1]);
        }
    }

    private static void compare(String s1, String s2) {
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        if (isEven(i1) && isEven(i2)) {
            System.out.printf("%d, %d -> both are even%n", i1, i2);
        } else if (!isEven(i1) && !isEven(i2)) {
            System.out.printf("%d, %d -> both are odd%n", i1, i2);
        }
        else {
            System.out.printf("%d, %d -> different%n", i1, i2);
        }
    }

    private static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
