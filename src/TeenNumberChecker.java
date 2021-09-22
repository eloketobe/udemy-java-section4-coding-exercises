public class TeenNumberChecker {
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {
        if (isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber))
            return true;
        else return false;
    }

    public static boolean isTeen(int number) {
        if (number > 12 && 20 > number)
            return true;
        else return false;
    }


}
