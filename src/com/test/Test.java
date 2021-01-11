package com.test;

public class Test {
    public static void main(String[] args) {
        int[] a = {13, 18, 24, 35, 47, 50, 62, 83, 90, 115, 134};
        int result = search(a);
        System.out.println("90下标为:" + result);
    }

    private static int search(int[] a) {
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] == 90) {
                return mid;
            } else if (a[mid] < 90) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}