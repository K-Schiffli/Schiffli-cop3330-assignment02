/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 Kevin Schiffli
 */
package ex33;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Magic8Ball {
    public String askQuestion() {

        List<String> answerList= new ArrayList<>();

        answerList.add("Yes");
        answerList.add("No");
        answerList.add("Maybe");
        answerList.add("Ask again later");

        Random rand = new Random();
        int selection = rand.nextInt((answerList.size()));

        return answerList.get(selection);
    }
}
