public class Task19 {
    public static void main(String[] args) {
        perc(100, 10);
    }
    static void perc(double num, int percentage){
        double res = num*percentage/100;
        System.out.println(res);
    }
}
