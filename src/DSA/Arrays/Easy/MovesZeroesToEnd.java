package DSA.Arrays.Easy;

import java.util.Arrays;

public class MovesZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeroes(int[] arr) {
        int i = 0, j = 0;
        while(j < arr.length){
            if(arr[j] != 0){
                swap(arr, i, j);
                i++;
                j++;
            } else {
                j++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
