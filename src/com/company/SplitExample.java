package com.company;

public class SplitExample {
    public static void main(String[] args) {
        String Str = new String("I really like this Java course");
        System.out.println("Return Value :");

        for (String retval : Str.split(" ")) {
            System.out.println(retval);
        }
    }
}