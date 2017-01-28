import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    private String[] listNumber;

    public FizzBuzz() {
        this.listNumber = new String[100];
        this.generatePositions();
    }

    private void generatePositions(){
        for(int i =0; i < this.listNumber.length ; i++){
            this.listNumber[i] = String.valueOf(i+1);
        }
    }


    public String generateNumber(int number) {
        if(number == 3){
            return "FIZZ";
        }


     return  this.listNumber[number-1];
    }
}
