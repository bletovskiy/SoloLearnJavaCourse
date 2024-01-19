import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = scan.nextInt();
        if (temp >=100){
            System.out.println("Boiling");
        }else{
            System.out.println("Not boiling");
        }
        scan.close();
    }
}
