package com.bridgelabz;

public class SecondLargestNumberOfArray {
    public static void main(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5, 16, 6, 7, 4, 4, 25, 34, 2, 4, 5, 8};
        for (int i=0; i< array2.length; i++){
            for (int j =0; j< array2.length;j++){
                if (array2[i]<array2[j]){
                    int temp = array2[i];
                    array2[i]=array2[j];
                    array2[j]=temp;
                }
            }
        }
        for (int i= array2.length-1; i< array2.length; i++){
            System.out.print(array2[i] + " ");
            System.out.print(array2[array2.length-2]);
        }
    }
}
