package com.company;

import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] cut = input.split(",");
            age = Integer.valueOf(cut[1]);
            if (age>oldest){
                oldest = age;
            }
        }
        System.out.println(oldest);
    }
}
