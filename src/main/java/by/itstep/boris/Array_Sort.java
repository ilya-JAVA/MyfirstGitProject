package main.java.by.itstep.boris;

import java.util.Arrays;

public class Array_Sort {
    public static void main(String[] args) {
    int a = 2;
    int b = 3;
    a = a + b;
    b = b - a;
    b = -b;
    a = a - b;

    a = a + b - (b = a);



    int[] arr = {};
    System.out.println(Arrays.toString(arr));
    Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {24, 2, 45, 1, 99, 3, 17, 21};
        System.out.println(Arrays.toString(arr));
        boolean isChanged = true;
        while (!isChanged) {
            isChanged = true;
            for (int i = 0; i < arr.length - 1; i++){
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isChanged = false;
                }
            }
        }
    }
}
