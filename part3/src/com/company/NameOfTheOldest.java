package com.company;

import java.util.Scanner;

public class NameOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int oldest = 0;
        String name = "";
        String oldestName = "";
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")) break;
            String[] cut = input.split(",");
            age = Integer.valueOf(cut[1]);
            name = cut[0];
            if (age>oldest){
                oldest = age;
                oldestName = name;
            }
        }
        System.out.println("Name of the oldest:"+oldestName);
    }
}
