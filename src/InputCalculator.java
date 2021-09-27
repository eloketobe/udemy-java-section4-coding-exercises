import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter a number or an invalid value to exit");
            boolean enteredAnInt = scanner.hasNextInt();
            if (enteredAnInt) {
                number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                break;
            }
            scanner.nextLine();
        }

        int average = (int) Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + String.valueOf(average));
    }
}
