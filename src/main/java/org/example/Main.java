package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
                Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
         */

        System.out.println("\n*********  Exponent Calculator  *********\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Base: ");
        int a = input.nextInt();
        System.out.print("Exponent: ");
        int b = input.nextInt();
        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }
        System.out.println("Result: " + result);
    }
}