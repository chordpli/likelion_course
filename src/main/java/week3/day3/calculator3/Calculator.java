package week3.day3.calculator3;

import week3.day3.calculator2.NumberCreator;

public class Calculator {
    // NumberCreator
    NumberGenerator numberGenerator;
    int baseNumber;

    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.baseNumber = 10;
    }

    public Calculator(NumberGenerator numberGenerator, int baseNumber) {
        this.numberGenerator = numberGenerator;
        this.baseNumber = baseNumber;
    }

    public void plus(int num) {
        System.out.println(baseNumber + numberGenerator.create(num));
    }
}