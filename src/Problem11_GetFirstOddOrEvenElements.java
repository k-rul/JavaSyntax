import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> intList = new ArrayList<>();

        while (in.hasNextInt()) {
            intList.add(in.nextInt());
        }

        in.next(); //Skipping "Get"
        int numbersToReturn = in.nextInt();
        String typeSort = in.next();

        List<Integer> finaldList = sortElements(intList, numbersToReturn, typeSort);

        for (Integer integer : finaldList) {
            System.out.printf("%d ", integer);
        }
    }

    private static List<Integer> sortElements(List<Integer> aList, int aNumberOfElements, String aTypeSort) {
        List<Integer> sortedList = new ArrayList<>();

        int maxAdding = aList.size() <= aNumberOfElements ? aList.size() : aNumberOfElements;
        int addedNumbers = 0;

        for (int i = 0; i < aList.size(); i++) {
            if (addedNumbers < maxAdding) {
                if (isSameType(aList.get(i), aTypeSort)) {
                    sortedList.add(aList.get(i));
                    addedNumbers++;
                }
            }
        }
        return sortedList;
    }

    private static boolean isSameType(int aNumber, String aTypeSort) {

        if (aTypeSort.equals("odd")) {
            if (aNumber % 2 != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (aNumber % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

}

