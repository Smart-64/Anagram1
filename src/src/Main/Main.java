package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Anagram anagram = new Anagram();
        System.out.println("Введите текст");
        System.out.println(anagram.ReverseWords(console.nextLine()));
        console.close();
    }
}
