import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by Momchil on 19-Mar-16.
 */
public class Problem4_CalculateExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        double f1 = Math.pow(((Math.pow(a, 2f) + Math.pow(b, 2f)) / ((Math.pow(a, 2f) - Math.pow(b, 2f)))), (a + b + c) / Math.sqrt(c));
        double f2 = Math.pow(((Math.pow(a, 2f)) + (Math.pow(b, 2f)) - (Math.pow(c, 3f))), (a - b));

        double numAverage = ((a + b + c) / 3f) - ((f1 + f2)/2f);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, Math.abs(numAverage));
    }
}
