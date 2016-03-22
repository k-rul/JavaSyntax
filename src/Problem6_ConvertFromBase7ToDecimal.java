import java.util.Scanner;

public class Problem6_ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int seven = in.nextInt();
        String sSeven = Integer.toString(seven);

        System.out.println(Integer.toString(Integer.parseInt(sSeven,7), 10));
    }
}
