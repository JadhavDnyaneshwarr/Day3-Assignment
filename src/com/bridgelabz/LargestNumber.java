package com.bridgelabz;

public class LargestNumber {
    public static void main(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5, 16, 6, 7, 4, 4, 25, 2, 4, 5, 8};
        int k=0;
        for (int i=0; i< array2.length; i++){
            for (int j=0; j< array2.length;j++){
                if (array2[i]>array2[j]){
                    if (array2[i]> k){
                        k=array2[i];
                    }
                }
            }
        }
        System.out.println(k);
    }
}
