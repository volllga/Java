package com.company;

public class method_my {
    public static void main(String[] args){ //void значит ничего не возвращает
        int[] array = {2, 5, 7, 9};
        printArrayToConsole(array);

        double x = 5;
        double y = 10;
        System.out.println(x + " + " + y + " = " + sumDouble(x, y));
    }


    public static void printArrayToConsole(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.print(arrayToPrint[i]);
        }
        System.out.println();
    }


    static double sumDouble(double a, double b){
        double sum = a+b;
        return sum;

    }
}