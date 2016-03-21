import java.util.Scanner;

/**
 * Created by Momchil on 19-Mar-16.
 */
public class Problem2_TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ax = in.nextInt();
        int ay = in.nextInt();

        int bx = in.nextInt();
        int by = in.nextInt();

        int cx = in.nextInt();
        int cy = in.nextInt();

        double area = (ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2;

        System.out.println(Math.abs(Math.round(area)));
    }
}
