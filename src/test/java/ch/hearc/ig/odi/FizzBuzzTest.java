package ch.hearc.ig.odi;

import ch.hearc.ig.odi.fizzbuzz.business.Fizzbuzz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    Fizzbuzz fizzbuzz;

    @Before
    public void setUp() {
        fizzbuzz = new Fizzbuzz();
    }

    @Test
    public void multipleOfThree() {
        Assert.assertTrue("It is a multiple of 3 [number: 3]", fizzbuzz.isMultipleOfThree(3));
        Assert.assertTrue("It is a multiple of 3 [number: 12]", fizzbuzz.isMultipleOfThree(12));
        Assert.assertTrue("It is a multiple of 3 [number: 6]", fizzbuzz.isMultipleOfThree(6));
        Assert.assertTrue("It is a multiple of 3 [number: -12]", fizzbuzz.isMultipleOfThree(-12));
    }

    @Test
    public void notMultipleOfThree() {
        Assert.assertFalse("It's not a multiple of 3 [number: 7]", fizzbuzz.isMultipleOfThree(7));
        Assert.assertFalse("It's not a multiple of 3 [number: 10]", fizzbuzz.isMultipleOfThree(10));
        Assert.assertFalse("It's not a multiple of 3 [number: 22]", fizzbuzz.isMultipleOfThree(22));
        Assert.assertFalse("It's not a multiple of 3 [number: -32]", fizzbuzz.isMultipleOfThree(-32));
    }

    @Test
    public void multipleOfFive() {
        Assert.assertTrue("It is a multiple of 5 [number: 20]", fizzbuzz.isMultipleOfFive(20));
        Assert.assertTrue("It is a multiple of 5 [number: 30]", fizzbuzz.isMultipleOfFive(30));
        Assert.assertTrue("It is a multiple of 5 [number: 100]", fizzbuzz.isMultipleOfFive(100));
        Assert.assertTrue("It is a multiple of 5 [number: -10]", fizzbuzz.isMultipleOfFive(-10));
    }

    @Test
    public void notMultipleOfFive() {
        Assert.assertFalse("It's not a multiple of 5 [number: 12]", fizzbuzz.isMultipleOfFive(12));
        Assert.assertFalse("It's not a multiple of 5 [number: 27]", fizzbuzz.isMultipleOfFive(27));
        Assert.assertFalse("It's not a multiple of 5 [number: 99]", fizzbuzz.isMultipleOfFive(99));
        Assert.assertFalse("It's not a multiple of 5 [number: -74]", fizzbuzz.isMultipleOfFive(-74));
    }

    @Test
    public void multipleOfThreeAndFive() {
        Assert.assertTrue("It's a multiple of 3 and 5 [number: 15]", fizzbuzz.isMultipleOfThreeAndFive(15));
        Assert.assertTrue("It's a multiple of 3 and 5 [number: 30]", fizzbuzz.isMultipleOfThreeAndFive(30));
        Assert.assertTrue("It's a multiple of 3 and 5 [number: -15]", fizzbuzz.isMultipleOfThreeAndFive(30));
        Assert.assertTrue("It's a multiple of 3 and 5 [number: -45]", fizzbuzz.isMultipleOfThreeAndFive(30));
    }

    @Test
    public void notMultipleOfThreeAndFive() {
        Assert.assertFalse("It's not a multiple of 3 and 5 [number: 9]", fizzbuzz.isMultipleOfThreeAndFive(9));
        Assert.assertFalse("It's not a multiple of 3 and 5 [number: 18]", fizzbuzz.isMultipleOfThreeAndFive(18));
        Assert.assertFalse("It's not a multiple of 3 and 5 [number: 10]", fizzbuzz.isMultipleOfThreeAndFive(10));
        Assert.assertFalse("It's not a multiple of 3 and 5 [number: -5]", fizzbuzz.isMultipleOfThreeAndFive(-5));
    }

}
