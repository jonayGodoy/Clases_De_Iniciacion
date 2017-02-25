import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FizzBuzzShouldDirect {
    @Test
    public void First_position_getPosition_1() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();

        String number = fizzBuzzDirect.getPosition(1);

        Assert.assertThat("1",is(number));
    }

    @Test
    public void Second_position_getPosition_2() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();

        String number = fizzBuzzDirect.getPosition(2);

        Assert.assertThat("2",is(number));
    }

    @Test
    public void Fourth_position_getPosition_4() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();

        String number = fizzBuzzDirect.getPosition(4);

        Assert.assertThat("4",is(number));
    }
    @Test
    public void Third_position_getPosition_3() throws Exception {
         FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
         String Fizz = fizzBuzzDirect.getPosition(3);
         Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Fiveth_position_getPosition_5() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
        String Buzz = fizzBuzzDirect.getPosition(5);
        Assert.assertThat("Buzz",is(Buzz));
    }
    @Test
    public void Sixth_position_getPosition_6() throws Exception {
         FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
         String Fizz = fizzBuzzDirect.getPosition(6);
         Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Nineth_position_getPosition_9() throws Exception {
         FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
         String Fizz = fizzBuzzDirect.getPosition(9);
         Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Tenth_position_getPosition_10() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
        String Buzz = fizzBuzzDirect.getPosition(10);
        Assert.assertThat("Buzz",is(Buzz));
    }
    @Test
    public void Thirdteneth_position_getPosition_13() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
        String Fizz = fizzBuzzDirect.getPosition(13);
        Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Fivetenth_position_getPosition_15() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
        String FizzBuzz = fizzBuzzDirect.getPosition(15);
        Assert.assertThat("FizzBuzzDirect",is(FizzBuzz));
    }
    @Test
    public void TwentyThreeth_position_getPosition_23() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
        String Fizz = fizzBuzzDirect.getPosition(23);
        Assert.assertThat("Fizz",is(Fizz));
    }
    @Test
    public void Fivetenth_position_getPosition_30() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
        String FizzBuzz = fizzBuzzDirect.getPosition(30);
        Assert.assertThat("FizzBuzzDirect",is(FizzBuzz));
    }
    @Test
    public void Fithytwoth_position_getPosition_52() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
        String Buzz = fizzBuzzDirect.getPosition(52);
        Assert.assertThat("Buzz",is(Buzz));
    }
    @Test
    public void Fithythreeth_position_getPosition_53() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
        String FizzBuzz = fizzBuzzDirect.getPosition(53);
        Assert.assertThat("FizzBuzzDirect",is(FizzBuzz));
    }
    @Test
    public void Fithyoneth_position_getPosition_51() throws Exception {
        FizzBuzzDirect fizzBuzzDirect = new FizzBuzzDirect();
        String FizzBuzz = fizzBuzzDirect.getPosition(51);
        Assert.assertThat("FizzBuzzDirect",is(FizzBuzz));
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
