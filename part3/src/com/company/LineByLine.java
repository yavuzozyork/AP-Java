package com.company;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "once upon a time";
        System.out.println(text);
        String[] pieces = text.split(" ");
        System.out.println(pieces[0]);
        System.out.println(pieces[1]);
        System.out.println(pieces[2]);
        System.out.println(pieces[3]);

        System.out.println();
//
//        for (int i = 0; i < pieces.length; i++) {
//            System.out.println(pieces[i]);
//
//        }
        String text1 = "a little program";
        System.out.println(text1);
        String[] pieces1 = text1.split(" ");
        System.out.println(pieces1[0]);
        System.out.println(pieces1[1]);
        System.out.println(pieces1[2]);

        System.out.println();
//
//        for (int i = 0; i < pieces1.length; i++) {
//            System.out.println(pieces1[i]);
//        }

        String text2 = "halted";
        System.out.println(text2);
        String[] pieces2 = text2.split(" ");
        System.out.println(pieces2[0]);

        System.out.println();

//        for (int i = 0; i < pieces2.length; i++) {
//            System.out.println(pieces2[i]);
//        }
    }
}
