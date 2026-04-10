package DSA.Arrays.Easy;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int k = missingNumber(arr);
        System.out.println(k);
    }

    private static int missingNumber(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            min = Math.min(min, i);
        }

        for(int i = min ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(i == arr[j]){

                }
            }
        }
    }
}
