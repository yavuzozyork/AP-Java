package com.company;

import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] text = input.split(" ");
        int index = 0;
        while (!(input.equals("")) && index< text.length){
            for (int i = 0; i< text.length;i++){
                if (text[i].contains("av")){
                    System.out.println(text[i]);
                }
            }
        }
    }
}
