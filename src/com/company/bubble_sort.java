package com.company;

public class bubble_sort {
    public static void main(String[] args){
        int[] arraySmall = {33, 1, 18, 17, 45, 3, 64, 12, 5, 17, 84, 31};
        bubbleSort(arraySmall);

    }
    static void bubbleSort(int[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < array.length -1; i++){
                if(array[i] > array[i +1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i : array) System.out.print(i + " ");
    }
}
