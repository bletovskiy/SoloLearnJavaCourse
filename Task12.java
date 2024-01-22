import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner scan = new Scanner(System.in);
        
        int choice = scan.nextInt();

        if (choice >= 0 && choice <= menu.length) {
            System.out.println(menu[choice]);
        }else{
            System.out.println("Invalid");
        }
        


        scan.close();
    }
}
