import java.util.Scanner;

public class SumTenUserNumbers {
    public static void printSumOfTenNumbers() {
        Scanner scanner = new Scanner(System.in);
        int order = 1;
        int sum = 0;
        int num;
        while (true) {
            System.out.println("Enter number #" + order);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                num = scanner.nextInt();
                sum += num;
                if (order == 10) break;
                order++;
            } else {
                System.out.println("Enter valid number");
            }
            scanner.nextLine();
        }
        System.out.println("The sum of the " + order + " valid numbers entered is " + sum);
    }
}
