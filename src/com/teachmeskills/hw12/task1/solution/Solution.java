package com.teachmeskills.hw12.task1.solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class with static method to display abbreviations
 * contains a constant REGEX.
 */
public final class Solution {
    static final String REGEX = "\\b([A-Z]{2,6})\\b";

    private Solution() {
    }

    public static void displayAbbreviations(String inputText) {
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            for (int i = 0; i < matcher.groupCount(); i++) {
                System.out.println("\nThere is abbreviation: " + matcher.group(i));
            }
        }
    }
}