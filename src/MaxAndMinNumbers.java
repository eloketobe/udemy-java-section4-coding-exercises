import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void printMaxAndMinNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;
        Integer max = null;
        Integer min = null;
        boolean firstNumber = true;

        while (true) {
            System.out.println("Enter a number or enter an invalid value to exit loop");
            boolean enteredAnInt = scanner.hasNextInt();
            if (enteredAnInt) {
                number = scanner.nextInt();
                if (firstNumber) {
                    max = number;
                    min = number;
                    firstNumber = false;
                } else if (min > number) min = number;
                else if (max < number) max = number;

            } else {
                System.out.println("Invalid Number entered");
                break;
            }
            scanner.nextLine();
        }
        if (max == null && min == null) System.out.println("No number was entered");
        else System.out.println("The maximum number entered is " + max + " and the minimum number is " + min);
    }

}
