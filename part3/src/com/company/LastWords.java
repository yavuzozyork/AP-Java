package com.company;

import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] cut = input.split(" ");
            System.out.println(cut[cut.length-1]);
        }
    }
}
