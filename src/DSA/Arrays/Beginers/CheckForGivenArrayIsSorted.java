package DSA.Arrays.Beginers;

public class CheckForGivenArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 1};
        int len = arr.length - 1;
        boolean res = checkArrayIsSorted(arr, len);
        System.out.println(res);
    }

    private static boolean checkArrayIsSorted(int[] arr, int len) {
        for (int i = 0 ; i <= len - 1 ; i++){
            if(arr[i + 1] < arr[i]){
                return false;
            }
        }
        return true;
    }
}
