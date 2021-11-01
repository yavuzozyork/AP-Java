package com.company;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {5, 1, 9, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        return sum;
    }
}