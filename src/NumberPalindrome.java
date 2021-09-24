public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int num = number, reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
            System.out.print(lastDigit);
        }
        System.out.println("\nreversed number is " + reverse + " and normal number is " + number);
        if (reverse == number) return true;
        else return false;
    }
}
