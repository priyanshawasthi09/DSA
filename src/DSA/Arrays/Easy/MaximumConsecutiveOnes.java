package DSA.Arrays.Easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 1};
        int res = maximumConsecutiveOnes(arr);
        System.out.println(res);
    }

    private static int maximumConsecutiveOnes(int[] arr) {
        int curr_ones = 0, max_ones = 0;
        for(int i : arr){
            if(i == 1){
                curr_ones += 1;
            } else {
                max_ones = Math.max(max_ones, curr_ones);
                curr_ones = 0;
            }
        }
        return Math.max(max_ones, curr_ones);
    }
}
