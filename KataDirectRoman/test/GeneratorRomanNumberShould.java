import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GeneratorRomanNumberShould {


    @Test
    public void RomanNumber1() throws Exception {

        GeneratorRomanNumber generator = new GeneratorRomanNumber();
        int decimal = 1;
        String roman = generator.returnRomans(decimal);

        assertThat("I", is(roman));

    }

    @Test
    public void RomanNumber2() throws Exception {
        GeneratorRomanNumber generator = new GeneratorRomanNumber();
        int decimal = 2;
        String roman = generator.returnRomans(decimal);

        assertThat("II", is(roman));
    }

    @Test
    public void RomanNumber3() throws Exception {
        GeneratorRomanNumber generator = new GeneratorRomanNumber();
        int decimal = 3;
        String roman = generator.returnRomans(decimal);

        assertThat("III", is(roman));

    }

    @Test
    public void RomanNumber5() throws Exception {
        GeneratorRomanNumber generator = new GeneratorRomanNumber();
        int decimal = 5;
        String roman = generator.returnRomans(decimal);

        assertThat("V", is(roman));

    }

    @Test
    public void RomanNumber8() throws Exception {
        GeneratorRomanNumber generator = new GeneratorRomanNumber();
        int decimal = 8;
        String roman = generator.returnRomans(decimal);

        assertThat("VIII", is(roman));

    }

    @Test
    public void RomanNumber10() throws Exception {
        GeneratorRomanNumber generator = new GeneratorRomanNumber();
        int decimal = 10;
        String roman = generator.returnRomans(decimal);

        assertThat("X", is(roman));

    }
    @Test
    public void RomanNumber30() throws Exception {
        GeneratorRomanNumber generator = new GeneratorRomanNumber();
        int decimal = 30;
        String roman = generator.returnRomans(decimal);

        assertThat("XXX", is(roman));

    }

    @Test
    public void RomanNumberAny() throws Exception {
        GeneratorRomanNumber generator = new GeneratorRomanNumber();
        int decimal = 999;
        String roman = generator.returnRomans(decimal);

        assertThat("CMXCIX", is(roman));

    }


}