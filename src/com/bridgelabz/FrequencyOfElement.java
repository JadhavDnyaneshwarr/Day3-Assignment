package com.bridgelabz;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 4, 4, 2, 4, 5, 8};
        int  k=0;
        for (int i=0;i< array2.length;i++){
            for (int j=0;j<array2.length;j++){
                if (array2[i] == array2[j]){
                    k++;
                    continue;
                }
            }
            System.out.println(array2[i] +" is repeat "+ k +" times.");
            k = 0;
        }
    }
}
