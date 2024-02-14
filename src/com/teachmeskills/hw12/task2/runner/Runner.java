package com.teachmeskills.hw12.task2.runner;

import com.teachmeskills.hw12.task2.functional.Functional;

/**
 * Class with method main to run the program
 * arbitrary string given
 * method is called in this class (input parameter - given arbitrary string).
 */
public class Runner {
    public static void main(String[] args) {
        String inputText = "123 hello vladislav.kolos.y@gmail.com - 1234-0987-10 &*&^. 0987-1234-01 4567-0000-11 +(77)1098875 @mail.ru +(37)529";
        Functional.highlightAndDisplaySpecificInformation(inputText);
    }
}
