package DSA.Arrays.Beginers;

import java.util.Arrays;

public class RightRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateLeft(int[] arr) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, 0);
        reverse(arr, 1, arr.length - 1);
    }

    private static void reverse(int[] arr, int i, int i1) {
        while(i < i1){
            int temp = arr[i];
            arr[i] = arr[i1];
            arr[i1] = temp;
            i++;
            i1--;
        }
    }
}
