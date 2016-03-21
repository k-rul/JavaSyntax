import java.util.Scanner;

/**
 * Created by Momchil on 19-Mar-16.
 */
public class Problem5_ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dec = in.nextInt();
        String sDec = Integer.toString(dec);

        System.out.println(Integer.toString(Integer.parseInt(sDec,10), 7));
    }
}
