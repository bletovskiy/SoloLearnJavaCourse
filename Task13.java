public class Task13 {
    public static void main(String[] args) {
        int[] ages = {18, 33, 24, 64, 45};
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        System.out.println(sum);
    }
}
