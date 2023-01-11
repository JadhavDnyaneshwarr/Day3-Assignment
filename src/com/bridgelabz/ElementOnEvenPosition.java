package com.bridgelabz;

public class ElementOnEvenPosition {
    public static void main(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5, 16, 6, 7, 4, 4, 25, 2, 4, 5, 8};
        for (int i=0; i< array2.length; i++){
            if (i%2==0){
                System.out.print(array2[i] + " ");
            }
        }
    }
}
