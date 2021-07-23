package com.bitso.pedrochallenge;

import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(programIntro());

        do {
            System.out.print("String : ");
            String s = in.nextLine();

            if (s.trim().toLowerCase().equals("exit"))
                break;

            try {
                replaceString(s);
            } catch (Exception e) {
                System.out.println(e.toString());
            }

            System.out.println();


        } while (true);
    }

    private static void replaceString(String s) {
        if (!ProjectUtils.validateFormat(s.trim()))
            System.out.println("Format not valid. Accepted values : [a-z].");
        else {
            System.out.println("Result : " + ProjectUtils.getReplacedString(s.trim()));
        }
    }

    private static String programIntro() {
        return "Type any string [a-z]. \n" +
                "The program will return the string replacing every char with the next alphabet letter. e.g a = b, z = a.\n";
    }
}
