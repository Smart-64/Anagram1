package com.foxminded.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Anagram anagram = new Anagram();
        System.out.println("Введите текст");
        try (Scanner console = new Scanner(System.in)) {
            anagram.apply(console.nextLine());
        }
    }
}
