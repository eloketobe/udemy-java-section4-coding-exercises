import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kilobytes = sc.nextInt();
        MegabytesConverter.printMegaBytesAndKiloBytes(kilobytes); }
}
