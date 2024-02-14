package com.teachmeskills.hw12.task2.functional;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class with static method to highlight and display information about email, document number and phone number
 * contains constants REGEX_1, REGEX_2 and REGEX_3.
 */
public class Functional {
    static final String REGEX_1 = "\\b([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9_-]+)\\b";
    static final String REGEX_2 = "\\b(\\d{4}-\\d{4}-\\d{2})\\b";
    static final String REGEX_3 = "(\\+\\(\\d{2}\\)\\d{7})\\b";
    private Functional() {
    }

    public static void highlightAndDisplaySpecificInformation(String inputText) {
        Pattern pattern1 = Pattern.compile(REGEX_1);
        Matcher matcher1 = pattern1.matcher(inputText);
        while (matcher1.find()) {
            for (int i = 0; i < matcher1.groupCount(); i++) {
                System.out.println("\nemail: " + matcher1.group(i));
            }
        }

        Pattern pattern2 = Pattern.compile(REGEX_2);
        Matcher matcher2 = pattern2.matcher(inputText);
        while (matcher2.find()) {
            for (int i = 0; i < matcher2.groupCount(); i++) {
                System.out.println("\ndocument number: " + matcher2.group(i));
            }
        }

        Pattern pattern3 = Pattern.compile(REGEX_3);
        Matcher matcher3 = pattern3.matcher(inputText);
        while (matcher3.find()) {
            for (int i = 0; i < matcher3.groupCount(); i++) {
                System.out.println("\nphone number: " + matcher3.group(i));
            }
        }
    }
}
