package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToBeautify, PoemDecorator poemdecorator) {
        String result = poemdecorator.decorate(textToBeautify);
        System.out.println("Result is: " + result);
    }
}
