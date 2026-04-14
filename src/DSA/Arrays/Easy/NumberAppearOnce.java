package DSA.Arrays.Easy;

public class NumberAppearOnce {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        int appear_once = numberAppearOnce(arr);
        System.out.println(appear_once);
    }

    private static int numberAppearOnce(int[] arr) {
        int missing_number = 0;
        for(int i = 0 ; i < arr.length ; i++){
            missing_number ^= arr[i];
        }
        return missing_number;
    }
}
