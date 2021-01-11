package com.test;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println("排序之前:");
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(a));
        System.out.println("排序之后:");
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    private static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int left = 0;
            int right = i-1;
            int mid = 0 ;
            while (left <= right){
                mid = (left + right)/2;
                if (temp < a[mid]){
                    right = mid -1;
                }else{
                    left = mid +1;
                }
            }
            for (int j = i-1; j >=left; j--) {
                a[j+1]=a[j];
            }
            if (left != i){
                a[left] = temp;
            }
        }
    }
}
