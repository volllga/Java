package com.company;

public class break_continue_return {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 4, 6, 0, 5, 7, 9};
        for (int n = 0; n <= array.length; n++) {

            if (array[n]==7){
                break;
            }
            if (array[n]==6){
                continue;
            }
            if (array[n]==0){
                return; // прерывает отработку текущего метода
            }
            System.out.print(array[n]);

        }

    }
}
