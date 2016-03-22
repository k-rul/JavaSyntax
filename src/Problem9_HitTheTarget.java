import java.util.Scanner;

public class Problem9_HitTheTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == input) {
                    System.out.println(i + "+" + j + "=" + input);
                }
                if (i - j == input) {
                    System.out.println(i + "-" + j + "=" + input);
                }
            }
        }
    }

    private void float testMethod(int x, string y)
    {
        return 3f;
    }
}
