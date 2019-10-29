package com.example.javahw10;

import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

public class MyClass {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String in = scanner.nextLine();             //asdsad 不能轉換?
            for (int i = 0; i < in.length(); i++) {
                char c = in.charAt(i);
                //讓存在c裡面的a轉為小寫
                if (isUpperCase(c)) {

                    System.out.print(toLowerCase(c));              //使當前的c字元取代a字元
                } else if (isLowerCase(c)) {
                    System.out.print(toUpperCase(c));              //使當前的b字元取代a字元-
                }
            }
            System.out.println();
        }
    }
}
