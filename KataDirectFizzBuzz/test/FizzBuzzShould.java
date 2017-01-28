import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FizzBuzzShould {
    @Test
    public void First_position_getPosition_1() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String number = fizzBuzz.getPosition(1);

        Assert.assertThat("1",is(number));
    }

    @Test
    public void Second_position_getPosition_2() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String number = fizzBuzz.getPosition(2);

        Assert.assertThat("2",is(number));
    }

    @Test
    public void Fourth_position_getPosition_4() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String number = fizzBuzz.getPosition(4);

        Assert.assertThat("4",is(number));
    }
    @Test
    public void Third_position_getPosition_3() throws Exception {
         FizzBuzz fizzBuzz = new FizzBuzz();
         String Fizz = fizzBuzz.getPosition(3);
         Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Fiveth_position_getPosition_5() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String Buzz = fizzBuzz.getPosition(5);
        Assert.assertThat("Buzz",is(Buzz));
    }
    @Test
    public void Sixth_position_getPosition_6() throws Exception {
         FizzBuzz fizzBuzz = new FizzBuzz();
         String Fizz = fizzBuzz.getPosition(6);
         Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Nineth_position_getPosition_9() throws Exception {
         FizzBuzz fizzBuzz = new FizzBuzz();
         String Fizz = fizzBuzz.getPosition(9);
         Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Tenth_position_getPosition_10() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String Buzz = fizzBuzz.getPosition(10);
        Assert.assertThat("Buzz",is(Buzz));
    }
    @Test
    public void Thirdteneth_position_getPosition_13() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String Fizz = fizzBuzz.getPosition(13);
        Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Fivetenth_position_getPosition_15() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String FizzBuzz = fizzBuzz.getPosition(15);
        Assert.assertThat("FizzBuzz",is(FizzBuzz));
    }
    @Test
    public void TwentyThreeth_position_getPosition_23() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String Fizz = fizzBuzz.getPosition(23);
        Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Fivetenth_position_getPosition_30() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String FizzBuzz = fizzBuzz.getPosition(30);
        Assert.assertThat("FizzBuzz",is(FizzBuzz));
    }
    @Test
    public void Fithytwoth_position_getPosition_52() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String Buzz = fizzBuzz.getPosition(52);
        Assert.assertThat("Buzz",is(Buzz));
    }
    @Test
    public void Fithythreeth_position_getPosition_53() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String FizzBuzz = fizzBuzz.getPosition(53);
        Assert.assertThat("FizzBuzz",is(FizzBuzz));
    }
    @Test
    public void Fithyoneth_position_getPosition_51() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String FizzBuzz = fizzBuzz.getPosition(51);
        Assert.assertThat("FizzBuzz",is(FizzBuzz));
    }

    @Test
    public void numeross_multiplos_de_3_y_contienen_tres_y_fizz() throws Exception {
        Third_position_getPosition_3();
        Sixth_position_getPosition_6();
        Nineth_position_getPosition_9();
        Thirdteneth_position_getPosition_13();
        TwentyThreeth_position_getPosition_23();
        Fivetenth_position_getPosition_30();
    }
    @Test
    public void numeros_multiplos_de_5_y_contienen_5_y_devuelve_buzz() throws Exception {
        Fiveth_position_getPosition_5();
        Tenth_position_getPosition_10();
        Fithytwoth_position_getPosition_52();
    }

    @Test
    public void numeros_multiplos_de_15_contengan_3_y_5_que_devuelve_FizzBuzz() throws Exception {
        Fivetenth_position_getPosition_15();
        Fithyoneth_position_getPosition_51();
        Fithythreeth_position_getPosition_53();
    }





}
