package com.company;

import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 8;
        array[1] = 6;
        array[2] = 2;
        array[3] = 4;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;
        System.out.println("Search for?");
        int num = Integer.valueOf(scanner.nextLine());
        int index = 0;
        boolean result = false;
        while (index<array.length){
            if (array[index] == num){
                result = true;
                break;
            } else {
                result =false;
            }
            index++;
        }
        if (result) {
            System.out.println(num +" is at index " + index);
        }else {
            System.out.println(num + "was not found");
        }
    }
}
