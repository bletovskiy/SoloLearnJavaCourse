import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        convert(num);
        scan.close();
    }
    static void convert(double num){
        double res = num* 12;
        System.out.println(res);
    }
    
}
