package com.test;

public class Test2 {
    public static void main(String[] args) {
        int a[]=new int[10];
        System.out.print("排序前:");
        for(int i=1;i<a.length;i++){
            a[i]=(int)(Math.random()*100);
            System.out.print(a[i]+" ");
            for(int j=i;j>0;j--) {
                if (a[j]<a[j-1]) {
                    int t = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println();
        System.out.print("排序后:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
