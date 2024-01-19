import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Name: " + name);
        scan.close();
    }
}
