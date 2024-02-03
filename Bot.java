import java.util.Scanner;
public class Bot {
    public static void main(String[] args) {
        bot();
    }
    static void bot(){
        Scanner scan = new Scanner(System.in);
        int user = scan.nextInt();
        switch (user) {
            case 1:
                System.out.println("Order confirmed");
                break;
            case 2:
                System.out.println("info@sololearn.com");
                break;
            default: System.out.println("Try again");
                break;
        }
    scan.close();
    }
}
