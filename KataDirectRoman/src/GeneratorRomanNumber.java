import com.sun.org.apache.xml.internal.resolver.readers.XCatalogReader;

/**
 * Created by Usuario on 21/01/2017.
 */
public class GeneratorRomanNumber {
    public String returnRomans(int decimal) {

        String roman = "";

        for(ConstRoman constRom : ConstRoman.values()) {
            while(decimal >= constRom.decimal){
                roman += constRom.roman;
                decimal = decimal - constRom.decimal;
            }
        }

        return roman;
    }

    public enum ConstRoman{

        THOUSAND(1000,"M"),
        NINETHOUSAND(900, "CM"),
        FIVEHUNDRED(500,"D"),
        FOURHUNDRED(400,"CD"),
        HUNDRED(100,"C"),
        NINETY(90, "XC"),
        FIFTY(50,"L"),
        FORTY(40, "XL"),
        TEN(10,"X"),
        NINE(9, "IX"),
        FIVE(5,"V"),
        FOUR(4, "IV"),
        ONE(1, "I");

        private final String roman;
        private final int decimal;

        ConstRoman(int decimal, String roman) {
            this.decimal = decimal;
            this.roman = roman;
        }
    }


}
