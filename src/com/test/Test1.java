package com.test;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        insertSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void insertSort(int[] array){
        int a = 0;
        int b = 0;
        for (int i = 1; i < array.length; i++) {
            a = array[i];
            b = i-1;
            while (b >= 0 && a < array[b]){
                array[b + 1] = array[b];
                b--;
            }
            if (b+1 != i){
                array[b+1] = a;
            }
        }
    }
}
