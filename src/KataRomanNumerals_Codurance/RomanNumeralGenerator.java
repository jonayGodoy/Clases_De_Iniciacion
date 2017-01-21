package KataRomanNumerals_Codurance;

public class RomanNumeralGenerator {
    public static String romanFor(int decimal)
    {
        String roman = "";
        if(decimal >= 10){
            roman = roman + "X";
            decimal = decimal - 10;
        }
        if(decimal >= 5){
            roman = roman + "V";
            decimal = decimal - 5;
        }

        for(int i= 0; i < decimal; i++){
            roman = roman + "I";
        }
        return roman;
    }
}
