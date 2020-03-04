package main.java.by.itstep.boris;

import java.util.Arrays;

public class Array_sort2 {
    public static void main(String[] args) {

        int[] arr = {22, 15, 44, 1};
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
