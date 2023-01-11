package com.bridgelabz;

public class DuplicateValueNumbers {
    public static void main(String[] args) {
        int[] array2 = {11, 2, 3, 4, 5, 16, 6, 7, 4, 4, 25, 2, 4, 5, 8};
        int count=0;
        for (int i=0; i< array2.length; i++){
            for(int j = 0;j<array2.length;j++){
                if (array2[i]==array2[j]){
                    count++;
                }
            }
            if (count>1){
                System.out.println(array2[i] + " occurs "+count+" times");
            }
            count=0;
        }
    }
}
