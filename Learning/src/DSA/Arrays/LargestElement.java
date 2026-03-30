package DSA.Arrays;

public class LargestElement {
    public static void main(String[] args)
    {
        int[] arr = {2, 5, 1, 3, 0};
        int res = findLargest(arr);
        System.out.println(res);
    }

    private static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
}
