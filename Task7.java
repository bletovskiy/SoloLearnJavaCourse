import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int N = scan.nextInt();
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        }while (i <= N);
        System.out.println(sum);
        scan.close();
    }
}
