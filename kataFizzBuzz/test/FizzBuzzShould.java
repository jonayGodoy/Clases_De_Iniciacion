import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FizzBuzzShould {

    @Test
    public void limit_100_positions() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        try {
            fizzBuzz.generateNumber(101);
            Assert.assertTrue(false);
        } catch (ArrayIndexOutOfBoundsException expectedException) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void first_position_return_1() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.generateNumber(1);

        Assert.assertThat(number, is("1"));
    }


    @Test
    public void first_position_return_2() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.generateNumber(2);

        Assert.assertThat(number, is("2"));
    }

    @Test
    public void first_position_return_4() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.generateNumber(4);

        Assert.assertThat(number, is("4"));
    }

    @Test
    public void third_position_return_FIZZ() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String number = fizzBuzz.generateNumber(3);

        Assert.assertThat(number, is("FIZZ"));

    }
}
