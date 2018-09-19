package ch.hearc.ig.odi.fizzbuzz.business;

public class Fizzbuzz {

    public Fizzbuzz() {

    }

    public Boolean isMultipleOfThree(Integer number) {
        if (number % 3 == 0)
            return true;
        return false;
    }

    public Boolean isMultipleOfFive(Integer number) {
        if(number % 5 == 0)
            return true;
        return false;
    }

    public Boolean isMultipleOfThreeAndFive(Integer number) {
        if (this.isMultipleOfThree(number) && this.isMultipleOfFive(number))
            return true;
        return false;
    }
}
