package com.foxminded.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Anagram anagram = new Anagram();
        System.out.println("Введите текст");
        try(Scanner console = new Scanner(System.in))
        {
            String[] words = anagram.splitStr(console.nextLine());
            System.out.println(anagram.ReverseWords(words));

        }

    }
}
