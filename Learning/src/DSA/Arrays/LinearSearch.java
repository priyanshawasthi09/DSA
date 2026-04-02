package DSA.Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 2, 1, 5, 3, 4, 7};
        int k = sc.nextInt();
        int res = findElement(arr, k);
        System.out.println(res);
    }

    private static int findElement(int[] arr, int k) {
        for(int i : arr){
            if(k == i){
                return i;
            }
        }
        return -1;
    }
}
