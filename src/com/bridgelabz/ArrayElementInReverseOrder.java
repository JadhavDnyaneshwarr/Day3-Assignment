package com.bridgelabz;

public class ArrayElementInReverseOrder {
    public static void main(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5, 16, 6, 7, 4, 4, 25, 2, 4, 5, 8};
        for (int i= array2.length-1; i>=0; i--){
            System.out.print(array2[i] + " ");
        }
    }
}
