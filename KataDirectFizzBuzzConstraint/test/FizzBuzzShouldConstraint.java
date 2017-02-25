import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FizzBuzzShouldConstraint {

    @Test
    public void Positon1return1() throws Exception {
        FizzBuzzConstraint fizzBuzz = new FizzBuzzConstraint();
        String result = fizzBuzz.getPosition(new Position(1));

        Assert.assertThat("1", is(result));

    }

    @Test
    public void Positon3returnFizz() throws Exception {
        FizzBuzzConstraint fizzBuzz = new FizzBuzzConstraint();
        String result = fizzBuzz.getPosition(new Position(3));

        Assert.assertThat("Fizz", is(result));
    }
}

