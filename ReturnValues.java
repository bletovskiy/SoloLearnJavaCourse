public class ReturnValues {
    public static void main(String[] args) {
        double x = perc(530, 23);
        System.out.println("Result is: " + x);
    }
    static double perc(double num, int percentage){
        double res = num*percentage/100;
        return res;
    }
}
