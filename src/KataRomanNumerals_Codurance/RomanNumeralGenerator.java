package KataRomanNumerals_Codurance;

public class RomanNumeralGenerator {
    public static String romanFor(int decimal)
    {
        String roman = "";
        for(RomanToDecimal romanToDecimal : RomanToDecimal.values()){
            while(decimal >= romanToDecimal.decimal){
                roman = roman + romanToDecimal.roman;
                decimal = decimal - romanToDecimal.decimal;
            }
        }

        return roman;
    }


    enum RomanToDecimal{
        TEN("X",10),
        NINE("IX",9),
        FIVE("V",5),
        FOUR("IV",4),
        ONE("I",1);

        private final int decimal;
        private final String roman;

        RomanToDecimal(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }
    }

}


