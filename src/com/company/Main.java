package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.print(sentence.toUpperCase().charAt(0)+""+sentence.substring(1).toLowerCase());

     }
}
