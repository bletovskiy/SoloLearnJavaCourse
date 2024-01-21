import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        long factorial = 1;

        for(int x = 1; x <= number; x++){
            factorial *= x;
        }
        System.out.println(factorial);
        scan.close();
    }
}