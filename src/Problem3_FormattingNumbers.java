import java.util.Scanner;

/**
 * Created by Momchil on 19-Mar-16.
 */
public class Problem3_FormattingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        float b = in.nextFloat();
        float c = in.nextFloat();

        String aHex;
        String aBin;
        String bRound;
        String cRound;

        aHex = String.format("|%-10s", Integer.toHexString(a).toUpperCase());
        aBin = String.format("|%10s", Integer.toBinaryString(a)).replace(' ', '0');
        bRound = String.format("|%10.2f", b);
        cRound = String.format("|%-10.3f|", c);

        System.out.println(aHex + aBin + bRound + cRound);
    }
}
