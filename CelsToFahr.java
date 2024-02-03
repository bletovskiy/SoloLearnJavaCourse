import java.util.Scanner;

public class CelsToFahr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cels = scan.nextDouble();
        System.out.println(fahr(cels));
        scan.close();
    }
    static double fahr(double cels){
        double res = ((cels*9)/5)+32;
        return res;
    }
}
