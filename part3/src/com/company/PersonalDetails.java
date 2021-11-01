package com.company;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String longestName = "";
        int sum = 0;
        int num = 0;
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")) break;
            String[] cut = input.split(",");
            name = cut[0];
            if (name.length()>longestName.length()){
                longestName = name;
            }
            for (int i = 0; i<cut.length;i++){
                sum = sum+ Integer.valueOf(cut[1]);
                num++;
            }
        }
        double average = (1.0*sum/num);
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years:"+average);
    }
}
