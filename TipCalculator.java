import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tip = 0.15;
        double amount = scan.nextDouble();
        System.out.println(amount * tip);
        scan.close();
    }
}
