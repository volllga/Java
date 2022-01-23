package com.company;

import java.util.Arrays;

public class binary_search {
    public static void main(String[] args){
        int[] arraySmall = {1, 12, 31, 44, 55, 58, 63, 65, 90};
        int key = 55; // 4 index
        int position = binarySearch(arraySmall, key);
        System.out.println(key + " position is " + position);
    }

    static int binarySearch(int[] array, int key) {
        //int position = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == key) {
                System.out.println("Key found");
                return middle;
            }
            if (array[middle] < key) {
                left = middle + 1;
            }
            if (array[middle] > key) {
                right = middle - 1;
            }
        }
        return -1;
    }
}
