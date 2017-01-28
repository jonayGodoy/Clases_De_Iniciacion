import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FizzBuzzShould {
    @Test
    public void First_position_getPosition_1() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int number = fizzBuzz.getPosition(1);

        Assert.assertThat(1,is(number));
    }

    @Test
    public void Second_position_getPosition_2() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int number = fizzBuzz.getPosition(2);

        Assert.assertThat(2,is(number));
    }

    @Test
    public void Fourth_position_getPosition_4() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        int number = fizzBuzz.getPosition(4);

        Assert.assertThat(4,is(number));
    }
}
