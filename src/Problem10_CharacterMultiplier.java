import java.util.Scanner;

public class Problem10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(characterMultiplier(in.next(), in.next()));
    }

    private static int characterMultiplier(String str1, String str2) {
        int output = 0;

        int mLenght = str1.length() >= str2.length() ? str1.length() : str2.length();

        for (int i = 0; i < mLenght; i++) {
            if ((str1.length() >= i + 1) && (str2.length() >= i + 1)) {
                output += (int) str1.charAt(i) * (int) str2.charAt(i);
            } else if (str1.length() >= i + 1) {
                output += (int) str1.charAt(i);
            } else if (str2.length() >= i + 1) {
                output += (int) str2.charAt(i);
            }
        }
        return output;
    }
}
