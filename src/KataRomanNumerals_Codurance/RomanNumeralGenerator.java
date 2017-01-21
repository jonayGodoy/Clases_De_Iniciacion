package KataRomanNumerals_Codurance;

public class RomanNumeralGenerator {
    public static String romanFor(int decimal)
    {
        String roman = "";
        for(RomanToDecimal romanToDecimal : RomanToDecimal.values()){
            if(decimal >= romanToDecimal.decimal){
                roman = roman + romanToDecimal.roman;
                decimal = decimal - romanToDecimal.decimal;
            }
        }

        for(int i= 0; i < decimal; i++){
            roman = roman + "I";
        }
        return roman;
    }


    enum RomanToDecimal{
        TEN("X",10),
        FIVE("V",5);

        private final int decimal;
        private final String roman;

        RomanToDecimal(String roman, int decimal) {
            this.roman = roman;
            this.decimal = decimal;
        }
    }

}


