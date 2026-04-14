package DSA.Arrays.Easy;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] twoSum(int[] arr, int target) {
        int[] res = new int[2];
        for(int i = 1 ; i < arr.length ; i++){
            for(int j = i ; j < arr.length ; j++){
                if(arr[j] + arr[j - i] == target){
                    res[0] = j - i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}
