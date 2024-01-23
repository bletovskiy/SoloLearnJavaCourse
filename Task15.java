public class Task15 {
    public static void main(String[] args) {
        int[] nums = {3, 8, 5, 2};
        int res = 0;
        for (int i : nums) {
            if(i > res){
                res = i;
            }
        }
        System.out.println(res);
    }
}
