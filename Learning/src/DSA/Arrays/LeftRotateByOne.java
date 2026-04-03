package DSA.Arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateLeft(int[] arr) {
        int n = arr.length - 1;
        reverse(arr, 0, n);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int i, int n) {
        while(i < n){
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            i++;
            n--;
        }
    }
}
