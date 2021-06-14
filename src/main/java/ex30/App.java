/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex30;

public class App {

    public static void main( String[] args ) {
        MultTableGen mtg = new MultTableGen();
        String numbers[] = mtg.generateMultTable();

        for(int i = 0; i < 12; i++)
        {
            System.out.print(numbers[i]);
            System.out.print("\n");
        }
    }
}
