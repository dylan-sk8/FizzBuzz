package ch.hearc.ig.odi.fizzbuzz.console;

import ch.hearc.ig.odi.fizzbuzz.business.Fizzbuzz;

public class Main {
    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        for (int i = 1; i <= 100; i++){
            if(fizzbuzz.isMultipleOfThreeAndFive(i))
                System.out.println("FizzBuzz");
            else if(fizzbuzz.isMultipleOfThree(i))
                System.out.println("Fizz");
            else if (fizzbuzz.isMultipleOfFive(i))
                System.out.println("Buzz");
            else
                System.out.println(i);

        }
    }
}
