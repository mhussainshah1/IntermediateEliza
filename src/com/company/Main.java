package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * You will continue creating an interactive chat-bot type program. Eliza is a therapist program that interacts with the
 * user. Your program will need to evaluate what the user asks and turn the user's input into a question that sounds like
 * the therapist really cares.
 *
 * Use HashMaps or String arrays to loop through user's input and implement the following:
 *
 * Replacements:
 *
 * replace i with you
 * replace me with you
 * replace my with your
 * replace am with are
 * We will continue to build on top of this application throughout the week.
 *
 * Here's how the replacement works:
 *
 * The user enters something at the prompt: "my teacher hates me"
 *
 * The program will loop through that string and replace "my" with "your" and "me" with "you" and then prepend the
 * qualifier to the replacement string. So, my teacher hates me becomes "Why do you say that your teacher hates you?"
 * The replacement method returns the same words as the user entered only the replacement words have been swapped. Then
 * the qualifier is prepended to the user's words.
 *
 * Spend some time thinking how you would search through a string and replacing specific words. Hint: read about the
 * split
 *
 */
public class Main {

    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("i","you");
        myMap.put("me","you");
        myMap.put("my","your");
        myMap.put("am","are");

	    Scanner keyboard = new Scanner(System.in);
        String question,answer;
        System.out.print("Good day. What is your problem? ");
        while (true) {
            System.out.print("Enter your response here or Q to quit: ");
            question = keyboard.nextLine().toLowerCase();
            answer = "";
            for (String retval: question.split(" ")) {
                if(myMap.containsKey(retval)){
                    answer += myMap.get(retval) + " ";
                } else {
                    answer += retval + " ";
                }
            }
            System.out.println(answer);

            if (question.equalsIgnoreCase("I am feeling great") | question.equals("q")) {
                break;
            }
        }
    }
}