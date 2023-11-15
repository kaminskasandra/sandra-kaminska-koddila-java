package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;
import static java.awt.SystemColor.text;
public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Sample text for decoration", (String text) -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Sample text for decoration", (String text) -> text.toUpperCase());
        poemBeautifier.beautify("Sample text for decoration", (String text) -> text + "!!!");
        poemBeautifier.beautify("Sample text for decoration", (String text) -> "." + text + ".");

    }
}