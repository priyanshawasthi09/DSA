package DSA.Arrays;

public class SecondSmallestAndSecondLargest {
    public static void main(String[] args) {
        int[] arr = {1};
        int[] res = findSecondSmallestAndSecondLargest(arr);
        System.out.println("second smallest: " + res[0]);
        System.out.println("second largest: " + res[1]);
    }

    private static int[] findSecondSmallestAndSecondLargest(int[] arr) {
        int[] res = new int[2];
        res[0] = findSecondSmallest(arr);
        res[1] = findSecondLargest(arr);
        return res;
    }

    private static int findSecondLargest(int[] arr) {
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;
        for(int i : arr){
            if(max < i){
                secMax = max;
                max = i;
            } else if(max > i && secMax < i){
                secMax = i;
            }
        }
        return secMax == Integer.MIN_VALUE ? -1 : secMax;
    }

    private static int findSecondSmallest(int[] arr) {
        int min = arr[0];
        int secMin = Integer.MAX_VALUE;
        for(int i : arr){
            if(min > i){
                secMin = min;
                min = i;
            }else if(min < i && secMin > i){
                secMin = i;
            }
        }
        return secMin == Integer.MAX_VALUE ? -1 : secMin;
    }
}
