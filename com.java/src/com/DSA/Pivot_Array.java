package com.DSA;

public class Pivot_Array {
    public static void main(String[] args) {

        int pivot = 10;
        int a[] = {9, 12, 5, 10, 14, 3};

        int ans[] = new int[a.length];
        int index = 0;

        for(int i = 0; i < a.length; i++) {
            if(a[i] < pivot) {
                ans[index++] = a[i];
            }
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] == pivot) {
                ans[index++] = a[i];
            }
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] > pivot) {
                ans[index++] = a[i];
            }
        }

        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

