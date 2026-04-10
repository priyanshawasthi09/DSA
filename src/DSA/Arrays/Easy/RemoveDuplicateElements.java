package DSA.Arrays.Easy;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,3,3,3,3,3,3,3};
        int k = removeDuplicates(arr);
        System.out.println(k);
    }

    private static int removeDuplicates(int[] arr) {
        int k = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[k] != arr[i]){
                arr[++k] = arr[i];
            }
        }
        return k + 1;
    }
}
