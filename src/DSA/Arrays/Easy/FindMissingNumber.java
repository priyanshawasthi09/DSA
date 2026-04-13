package DSA.Arrays.Easy;

import java.util.Arrays;
import java.util.Map;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int k = missingNumber(arr);
        System.out.println(k);
    }

    private static int missingNumber(int[] arr) {
//        int size = arr.length + 1;
//        int total_sum = size * (size + 1) / 2;
//        for(int i = 0 ; i < arr.length ; i++){
//            total_sum -= arr[i];
//        }
//        return total_sum;

        int xor1 = 0, xor2 = 0;
        for(int i = 0 ; i < arr.length ; i++){
            xor1 ^= arr[i];
        }

        for(int i = 1 ; i <= arr.length + 1 ; i++){
            xor2 ^= i;
        }

        return xor1 ^ xor2;
    }
}
