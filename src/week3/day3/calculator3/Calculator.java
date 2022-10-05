package week3.day3.calculator3;

import week3.day3.calculator2.NumberCreator;

public class Calculator {
    // NumberCreator
    NumberGenerator numberGenerator;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void plus(){
        System.out.println(10 + numberGenerator.generate(20));
    }
}
