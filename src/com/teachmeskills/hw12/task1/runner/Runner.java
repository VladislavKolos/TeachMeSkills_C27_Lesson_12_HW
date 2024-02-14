package com.teachmeskills.hw12.task1.runner;

import com.teachmeskills.hw12.task1.solution.Solution;

import java.util.Scanner;

/**
 * Class with method main to run the program
 * here the user enters a string from the keyboard
 * method is called in this class (input parameter - string entered from the keyboard).
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        Solution.highlightAndDisplayAbbreviations(inputText);


    }
}
