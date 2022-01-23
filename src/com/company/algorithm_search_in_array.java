package com.company;

public class algorithm_search_in_array {
    public static void main(String[] args){
        int[] arraySmall = {33, 45, 3, 64, 12, 5, 17, 84, 31};
        printMaxElement(arraySmall);

    }
    static void printMaxElement(int[] array){
        int max = array[0];
        int maxIndex = 0;
        int comparisons = 0;
        int replacements = 0;
        for(int i = 0; i< array.length; i++){
            if(array[i]> max){
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisons++;
        }
        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + maxIndex);
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Replacements: " + replacements);
    }
}
