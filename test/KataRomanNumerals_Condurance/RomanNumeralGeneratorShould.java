package KataRomanNumerals_Condurance;


import KataRomanNumerals_Codurance.RomanNumeralGenerator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralGeneratorShould {

    @Test
    public void generate_a_roman_numeral_for_a_given_decimal_number() throws Exception {
        assertThat(RomanNumeralGenerator.romanFor(1), is("I"));
        assertThat(RomanNumeralGenerator.romanFor(2), is("II"));
        assertThat(RomanNumeralGenerator.romanFor(3), is("III"));
        assertThat(RomanNumeralGenerator.romanFor(5), is("V"));
        assertThat(RomanNumeralGenerator.romanFor(7), is("VII"));


    }
}
