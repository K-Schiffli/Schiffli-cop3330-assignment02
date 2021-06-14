/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex33;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Magic8Ball m8b = new Magic8Ball();

        getQuestion();
        String reply = m8b.askQuestion();

        System.out.print(reply);
    }

    private static void getQuestion() {
        System.out.println("What's your question?");
        in.nextLine();
    }
}
