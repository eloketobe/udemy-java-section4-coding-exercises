public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;
        int first = (int) firstNumber;
        int second = (int) secondNumber;
        System.out.println("check for " + first + " and " + second);
        if (first == second)

            return true;
        else return false;

    }
}
