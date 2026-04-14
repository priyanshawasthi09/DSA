package DSA.Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,7};
        int[] arr2 = {3, 4, 7, 7};
        int[] res = unionOfTwoSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }

    private static int[] unionOfTwoSortedArrays(int[] arr1, int[] arr2) {
        int i = 0 , j = 0;
        List<Integer> list = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){
            int val;

            if(arr1[i] < arr2[j]){
                val = arr1[i++];
            } else if(arr2[j] < arr1[i]){
                val = arr2[j++];
            } else {
                val = arr1[i++];
                j++;
            }

            if(list.isEmpty() || list.get(list.size() - 1) != val){
                list.add(val);
            }
        }

        while(i < arr1.length){
            if(list.isEmpty() || list.get(list.size() - 1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }

        while(j < arr2.length){
            if(list.isEmpty() || list.get(list.size() - 1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
